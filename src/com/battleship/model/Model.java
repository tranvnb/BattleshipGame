package com.battleship.model;

// This is the model class and we will create this as it is in the example project
public class Model {

	int boardSize = 7;
	int numShips = 3;
	int shipLength = 3;
	int shipsSunk = 0;
		
	int[] model = {boardSize, numShips, shipLength, shipsSunk};

	
	
	private String[]locs;
	
	// TODO: Generate 9 "no" if needed
	// Move Model class functions or data members from battleship game
	private String[]hits = {"no","no","no"};
	
	public Model() {
		
	}
	public Model(String[]loc) {
		this.locs= loc;
	}
	public String[] getLoc() {
		return this.locs;
	}
	public String[] getHit() {
		return this.hits;
	}
	public void setLoc(String[] loc) {
		this.locs =loc;
	}
	public void setHit(String[] hit) {
		this.hits = hit;
	}
	
	
	
	public boolean isSunk() {
		for(int i =0; i<hits.length; i++) {
			if(!"hit".equals(hits[i])) {
				return false;
			}
		}
		return true;
	}
	
	public boolean guess(String guess) {
		for(int i=0; i<locs.length; i++) {
			if(guess.equals(locs[i])){
				this.hits[i] = "hit";
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.locs[0] + " " + this.locs[1] + " " + this.locs[2] + " " +
				this.hits[0] + " " + this.hits[1] + " " + this.hits[2] + " ";
	}
}
