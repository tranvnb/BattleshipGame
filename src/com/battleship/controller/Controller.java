package com.battleship.controller;

import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.battleship.model.Convoy;
import com.battleship.ui.BattleshipGame;
import com.battleship.ui.view.GameTimer;
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
									//console check for winning condition
									//System.out.println("All ships destroyed");
									battleshipGame.updateFiringResultAt(position, hit);
									battleshipGame.getGameStatus().displayWON(guesses);
									//TODO: timer stop method here
									closeGame();
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
					
					if(convoy.shipsSunk == convoy.numShips) {
						System.out.println("All ships destroyed");
						battleshipGame.displayWON(guesses);
					}
					
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
//<<<<<<< HEAD
		battleshipGame.getGameStatus().displayLOSE();
		closeGame();
	}
	public void closeGame() {
		battleshipGame.getFrame().dispatchEvent(new WindowEvent(battleshipGame.getFrame(), WindowEvent.WINDOW_CLOSING));
//=======
		this.battleshipGame.getGameTimer().stopTimer();
		battleshipGame.displayLOSE();
	}

	public void resetGame() {
		this.battleshipGame.resetGame();
//>>>>>>> d5886976bde1f62fdc11992cfa2ec7d2d59635d0
	}
}
