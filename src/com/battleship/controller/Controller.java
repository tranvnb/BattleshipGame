package com.battleship.controller;

import com.battleship.model.Model;

//This is the controller class and we will create this as it is in the example project
public class Controller {
	int guesses = 0;
	Helper helper = new Helper();
	Model model;
	
	public Controller(Model model) {
		super();
		this.model = model;
	}




	public boolean processGuess(String guess) {
		String location = helper.parseGuess(guess);
		boolean hit = false;
		
		if(location != null) {
			this.guesses++;
			hit = model.fireGuess(location);
			if(hit && model.shipsSunk == model.numShips) {
				System.out.println("All ships destroyed");
			}
		}
		
		return hit;
	}
}
