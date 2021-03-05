package com.battleship.controller;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.battleship.model.Model;
import com.battleship.model.sound.FiringSound;
import com.battleship.ui.BattleshipGame;
import com.battleship.model.sound.*;

//This is the controller class and we will create this as it is in the example project
public class Controller {
	int guesses = 0;
	Helper helper = new Helper();
	Model convoy;
	FiringSound firingSound;
	LostSound lostSound;
	SunkSound sunkSound;
	WonSound wonSound;
	MissSound missSound;
	BattleshipGame battleshipGame;

	public Controller(Model convoy) {
		super();
		this.convoy = convoy;
	}

	public Controller(BattleshipGame battleshipGame, Model convoy) {
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
					boolean hit = false;

					if (position >= 0) {
						guesses++;
						hit = convoy.fireGuess(String.valueOf(position));
						if (hit && convoy.shipsSunk == convoy.numShips) {
							System.out.println("All ships destroyed");
							wonSound.play();
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

	public boolean processGuess(String guess) {
		String location = helper.parseGuess(guess);
		boolean hit = false;

		if (location != null) {
			this.guesses++;
			hit = convoy.fireGuess(location);
			if (hit && convoy.shipsSunk == convoy.numShips) {
				System.out.println("All ships destroyed");
			}
		}

		return hit;
	}

	public void endGame() {
		this.battleshipGame.popUpMessage("Sorry you lost!");
	}
}
