package com.battleship.controller;

//This is the controller class and we will create this as it is in the example project
public class Controller {
	int guesses = 0;
	
	public void processGuess(String guess) {
		int location = -1;
		location = Integer.parseInt(guess);
		
		if(location != -1) {
			this.guesses++;
			
		}
	}
}
