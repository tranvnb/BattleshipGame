package com.battleship.ui.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

// This is our main class
// We will create this class as it is from the other classes
public class GameStatusBoard extends JPanel {
	private JLayeredPane GameBoard;
	private JLabel guessDisplay;
	private JFrame game;
	public GameStatusBoard(JLayeredPane gameBoard, JFrame frame){
		super();
		this.GameBoard = gameBoard;
		this.game = frame;
		
		JLabel guessDisplay = new JLabel("");
		guessDisplay.setOpaque(false);
		guessDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		guessDisplay.setBounds(700, 35 , 300,80);
//		guessDisplay.setBackground(Color.WHITE);
		guessDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		guessDisplay.setForeground(Color.GREEN);
		guessDisplay.setFont(new Font(guessDisplay.getFont().getName(), guessDisplay.getFont().getStyle(), 20));
		guessDisplay.setText("Game has been started...");
		this.GameBoard.add(guessDisplay, Integer.valueOf(2));
		this.guessDisplay =guessDisplay;
		
	}
	
	public void displayHit(int guesses) {
		guessDisplay.setText("Guess " + guesses +": Hit");
	}
	public void displayMiss(int guesses) {
		guessDisplay.setText("Guess " + guesses +": Miss");
	}
	public void displaySunk(int guesses) {
		guessDisplay.setText("Guess " + guesses + ": You sunk my battleship!");
	}
	public void displayWON(int guesses) {
		guessDisplay.setText("You won in " + guesses + " guesses!");
		int dialogButton = JOptionPane.YES_NO_OPTION;
		int dialogResult = JOptionPane.showConfirmDialog(this, "You won!!! Do you want to play again?", "Game Over",dialogButton);
		if(dialogResult == 0) {
			//TODO: reset board method goes here
		} else {
			this.game.dispatchEvent(new WindowEvent(game, WindowEvent.WINDOW_CLOSING));
		}
	}
	
}
