package com.battleship.controller;

import java.util.Random;

// This is the Helper class for controller
// Here we will have the methods that will be used by the controller class
// like parseGuess method
public class Helper {

    private static Random random = new Random();
    private String shipIndexes[] = new String[49];
    
    public Helper() {
    	
    	// This will give us array of indexes according to board in 49 values
    	int count = 0;
    	// This will traverse through all 7 rows
    	for(int i = 0; i < 7; i++) {
    		// This will traverse through 7 columns
    		for(int j = 0; j < 7; j++) {
    			shipIndexes[count] = String.valueOf(i) + String.valueOf(j);
    			count++;
    		}
    	}
    }
    
    public static int randomizePosition(int maximum) {
        return random.nextInt(maximum);
    }
    
    // TODO: Work on controller
    // Take guess from event handler and parse it here
    String parseGuess(String guess) {
    	int guessAsInt = Integer.parseInt(guess);
    	return shipIndexes[guessAsInt];
    }
    
    

}
