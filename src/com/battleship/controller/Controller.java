package com.battleship.controller;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.battleship.model.Convoy;
import com.battleship.ui.BattleshipGame;
import com.battleship.model.sound.*;

//This is the controller class and we will create this as it is in the example project
public class Controller {
	int guesses = 0;
	Helper helper = new Helper();

	Convoy convoy;
	FiringSound firingSound;
	LostSound lostSound;
	SunkSound sunkSound;
	WonSound wonSound;
	MissSound missSound;
	BattleshipGame battleshipGame;

	public Controller(Convoy convoy) {
		super();
		this.convoy = convoy;
	}

	public Controller(BattleshipGame battleshipGame, Convoy convoy) {
		this.battleshipGame = battleshipGame;
		this.convoy = convoy;
		this.firingSound = new FiringSound();
		this.lostSound = new LostSound();
		this.wonSound = new WonSound();
		this.sunkSound = new SunkSound();
		this.missSound = new MissSound();
	}

	public void processGuess(int position) {
		this.firingSound.setCallback(new Sound.SoundCallbackFunction() {

			@Override
			public void actionAfterSound() {
				try {
					String location = helper.parseGuess(position + "");
					boolean hit = false;

					if (location != null) {
						guesses++;
						hit = convoy.fireGuess(location);
						if(hit) {
							battleshipGame.getGameStatus().displayHit(guesses);
							if(convoy.isSunk()) {
								battleshipGame.getGameStatus().displaySunk(guesses);
								if(convoy.shipsSunk == convoy.numShips) {
									System.out.println("All ships destroyed");
									battleshipGame.getGameStatus().displayWON(guesses);
								}
							}
						}
						else {
							battleshipGame.getGameStatus().displayMiss(guesses);
						}
					}
					
					if (hit) {
						sunkSound.play();
					} else {
						missSound.play();
					}

					battleshipGame.updateFiringResultAt(position, hit);
					battleshipGame.setLoading(false);
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
					e.printStackTrace();
				}

			}
		});

		try {
			this.firingSound.play();
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		}

	}

	public void endGame() {
		this.battleshipGame.popUpMessage("Sorry you lost!");
	}
}
