package com.battleship.model;

// This is the model class and we will create this as it is in the example project
public class Convoy {

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
	
	
	public Convoy(String[]loc) {
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
//		console check for convoy hit > down 
//		for(String i : this.hits) {
//			System.out.println(i);
//		}
		return false;
	}
	
	public boolean fireGuess(String guess) {
		
		for(int i=0; i<locs.length; i++) {
			if(guess.equals(locs[i])){
				if(this.hits[i].equals("hit")) {
					return true;
				}
				else {
					//console check for hit
					//System.out.println("You hit");
					this.hits[i] = "hit";
					
					shipsSunk++;
					return true;
				}
			}
		}
		//console check for miss
		//System.out.println("You missed");
		return false;
	}
}
