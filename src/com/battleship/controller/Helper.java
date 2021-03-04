package com.battleship.controller;

import java.util.Random;

// This is the Helper class for controller
// Here we will have the methods that will be used by the controller class
// like parseGuess method
public class Helper {

    private static Random random = new Random();

    public static int randomizePosition(int maximum) {
        return random.nextInt(maximum);
    }
    
    // TODO: Work on controller
    // Take guess from event handler and parse it here
    int parseGuess(String guess) {
    	String[] alphabet = {"A", "B", "C", "D", "E", "F", "G"};
    	
    	if(guess == null || guess.length() != 2 ) {
    		System.out.println("Enter the valid guess: ");
    	}
    	else {
    		
    	}
    	
    	return 0;
    }
    
    

}
