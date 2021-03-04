package com.battleship.model;

// This is the model class and we will create this as it is in the example project
public class Model {

	int boardSize = 7;
	public int numShips = 9;
	int shipLength = 3;
	public int shipsSunk = 0;
		
	int[] model = {boardSize, numShips, shipLength, shipsSunk};
	
	private String[] locs;
	
	// TODO: Generate 9 "no" if needed
	// Move Model class functions or data members from battleship game
	private String[]hits = {
			"no","no","no",
			"no","no","no",
			"no","no","no",
			};
	
	
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
		for(int i = 0; i < (numShips/shipLength); i++) {
			int j = i * shipLength;
			if(this.hits[j].equals("hit")&&this.hits[j+1].equals("hit")&&this.hits[j+2].equals("hit")) {
				this.hits[j] = "down";
				this.hits[j+1] = "down";
				this.hits[j+2] = "down";
				return true;
			}
		}
		for(String i : this.hits) {
			System.out.println(i);
		}
		return false;
	}
	
	public boolean fireGuess(String guess) {
		
		for(int i=0; i<locs.length; i++) {
			if(guess.equals(locs[i])){
				if(this.hits[i].equals("hit")) {
					System.out.println("Already hit");
					return true;
				}
				else {
					this.hits[i] = "hit";
					
					shipsSunk++;
					return true;
				}
			}
		}
		System.out.println("You missed");
		return false;
	}
	
	@Override
	public String toString() {
		return this.locs[0] + " " + this.locs[1] + " " + this.locs[2] + " " +
				this.hits[0] + " " + this.hits[1] + " " + this.hits[2] + " ";
	}	
}
