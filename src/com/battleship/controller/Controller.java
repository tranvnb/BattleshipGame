package com.battleship.controller;

import com.battleship.model.Model;
import com.battleship.view.View;

//This is the controller class and we will create this as it is in the example project
public class Controller {
	int guesses = 0;
	Helper helper = new Helper();
	Model model;
	View view;
	
	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
	}

	public boolean processGuess(String guess) {
		String location = helper.parseGuess(guess);
		boolean hit = false;
		
		if(location != null) {
			this.guesses++;
			hit = model.fireGuess(location);
			if(hit) {
				view.displayHit(guesses);
				if(model.isSunk()) {
					view.displaySunk(guesses);
					if(model.shipsSunk == model.numShips) {
						System.out.println("All ships destroyed");
						view.displayWON(guesses);
					}
				}
			}
			else {
				view.displayMiss(guesses);
			}
		}
		return hit;
	}
}
