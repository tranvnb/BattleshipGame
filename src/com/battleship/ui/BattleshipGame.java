package com.battleship.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import com.battleship.controller.Controller;
import com.battleship.model.Model;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Canvas;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import java.awt.FlowLayout;

public class BattleshipGame {

	private JFrame frame;
	private GameTimer timer;
	JLayeredPane layeredPane;
	Controller controller;
	public static Model model;
	Model[] ships;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BattleshipGame window = new BattleshipGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	

	public JLayeredPane getLayeredPane() {
		return layeredPane;
	}



	/**
	 * Create the application.
	 */
	public BattleshipGame() {
		initialize();
		initializeTimer();
	}
	
	private void initializeTimer() {
		///TODO: this call back function should be put on Controller file
		timer = new GameTimer(this.getLayeredPane(), new GameTimer.CallbackFunction() {
			
			@Override
			public void endGame() {
				JOptionPane.showMessageDialog(null, "Sorry, you lost!");
				///TODO: Playing sound
				
			}
		});		
		layeredPane.add(timer, Integer.valueOf(2));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 1039, 898);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		layeredPane.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		layeredPane.setLayer(panel, 0);
		panel.setBounds(180, 124, 677, 676);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(Color.LIGHT_GRAY);
		layeredPane.add(panel, Integer.valueOf(1));
		panel.setLayout(new GridLayout(7, 7, 2, 2));
		
		// add background image
		JLabel label = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/board.jpg"));
		label.setIcon(img);
		label.setBounds(10, 10, 1015, 898);
		
		label.setLayout(new GridLayout(9, 11, 2, 2));
		label.setOpaque(false);
		layeredPane.add(label, Integer.valueOf(0));
		
		
		
		// create 49 Panel
		JPanel arrayPanel[] = new JPanel[49];
		
		for(int i = 0; i < 49; i++) {
			arrayPanel[i] = new JPanel();
		}
		
		
		
		// create add 44 panel to main panel
		for(int i = 0; i < 49; i++) {
			arrayPanel[i].setBorder(new LineBorder(new Color(0, 0, 0)));
			arrayPanel[i].setOpaque(false);
			panel.add(arrayPanel[i]);
			arrayPanel[i].setLayout(new BorderLayout(0, 0));
		}
		
		//create 49 label and add 49 label to 49 panel
		JLabel labelArray[] = new JLabel[49];
		for(int i = 0; i < 49; i++) {
			labelArray[i] = new JLabel("");
			arrayPanel[i].add(labelArray[i]);
			labelArray[i].setName(String.valueOf(i));
			labelArray[i].setOpaque(false);
		}
		
	
	
		 
		
		//spawning 3 ships 
		int numShips = 3;
		int shipsSunk = 0;
		int boardSize = 7;
		int shipLength = 3;
		
		ships = new Model[numShips];
		do {
			for(int i=0; i<numShips; i++) {
				ships[i] = new Model(generateShip(boardSize, shipLength));
			}
		} while(collison(ships));
		
		
		
		// Initializing and passing model to controller
		controller = new Controller(model);
		
		// add even listener on label
		for(int i = 0; i < 49; i++) {
			labelArray[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if(arg0.getSource() instanceof JLabel) {
						String guessAsInt = ((JLabel) arg0.getSource()).getName();
						boolean hit;
						//----------> UI interaction methods go here
						//parseGuess method: from 0 to 49 to 00 to 66
						//checkGuess method: check if guess hit or miss
						
						// Parsing is done within the controller package using helper class
						// This also checks if its a hit or miss
						hit = controller.processGuess(guessAsInt); 
						
						//change the image according to checkGuess logic
						if(hit) {
							((JLabel) arg0.getSource()).setIcon(new ImageIcon("images/ship.png")); //change the path to your image
						}
						else {
							((JLabel) arg0.getSource()).setIcon(new ImageIcon("images/miss.png")); //change the path to your image
						}
						
						
						//centered the image on the label
						((JLabel) arg0.getSource()).setHorizontalAlignment(SwingConstants.CENTER);
						((JLabel) arg0.getSource()).setVerticalAlignment(SwingConstants.CENTER);
						JOptionPane.showMessageDialog(null, guessAsInt); //testing click
						
						//checkSunk: check if any ship is sunk > redirect to view.Display
						//checkifWon: check shipsSunk == NumShips > redirect to view.Display
					}	
				}
			});
		}
		
	}
	
		//generate random locations, 00 to 66
		public static String[] generateShip(int boardSize, int shipLength) {
			double direction = Math.floor(Math.random()*2);
			int row, col;
			if(direction == 1) {
				row = (int)Math.floor(Math.random() * boardSize);
				col = (int)Math.floor(Math.random() * (boardSize - shipLength + 1));
			}
			else { // vertical
				row = (int)Math.floor(Math.random() * (boardSize - shipLength + 1));
				col = (int)Math.floor(Math.random() * boardSize);
			}
			
			String[] newShipLocs = new String[shipLength];
			for (int i = 0; i < shipLength; i++) {
				if (direction == 1) {
					newShipLocs[i] = (row + "" + (col + i));
				} else {
					newShipLocs[i] =((row + i) + "" + col);
				}
			}
			return newShipLocs;
		}
	
		//collision check method
		public static boolean collison(Model[] ships) {
			List<String> allLocs = new ArrayList<>();
			for(int i=0;i<ships.length;i++) {
				for(int j=0; j<ships[i].getLoc().length;j++) {
					if(allLocs.contains(ships[i].getLoc()[j])) {
						return true;
					}		
				}
				Collections.addAll(allLocs, ships[i].getLoc());
			}
			
			// Here I used allLocs to create a String Array
			// This String array will be used to create an object of model class
			String[] locsArray = new String[9];
			for(int i = 0; i < locsArray.length; i++) {
				locsArray[i] = allLocs.get(i);
			}
			
			model = new Model(locsArray);
			
			System.out.println("ships locations: ");
			System.out.println();
			for(String i : locsArray) {
				System.out.print(i + " ");
			}
			return false;
		}
}
