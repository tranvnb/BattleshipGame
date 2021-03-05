package com.battleship.model;

// This is the model class and we will create this as it is in the example project
public class Model {

	int boardSize = 7;
	public int numShips = 9;
	int shipLength = 3;
	public int shipsSunk = 0;
		
	int[] model = {boardSize, numShips, shipLength, shipsSunk};
	
	private String[] locs;
	
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
	
	public boolean isSunk(int index) {
		for(int i = 0; i < hits.length; i++) {
			if(!this.hits[index].equals(hits[i])) {
				return false;
			}
		}
		return true;
	}
	
	public boolean fireGuess(String guess) {
		
		for(int i=0; i<locs.length; i++) {
			if(guess.equals(locs[i])){
				if(this.hits[i].equals("hit")) {
					System.out.println("Already hit");
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
