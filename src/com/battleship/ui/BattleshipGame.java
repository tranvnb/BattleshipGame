package com.battleship.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import com.battleship.model.Model;

import javax.swing.JTextField;
import java.awt.Font;
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
		panel.setBounds(170, 98, 677, 677);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(Color.LIGHT_GRAY);
		layeredPane.add(panel);
		panel.setLayout(new GridLayout(8, 8, 2, 2));
		

		// create 64 Panel
		JPanel arrayPanel[] = new JPanel[64];
		
		for(int i = 0; i < 64; i++) {
			arrayPanel[i] = new JPanel();
		}
		
		
		
		// create add 44 panel to main panel
		for(int i = 0; i < 64; i++) {
			arrayPanel[i].setBorder(new LineBorder(new Color(0, 0, 0)));
			arrayPanel[i].setOpaque(false);
			panel.add(arrayPanel[i]);
			arrayPanel[i].setLayout(new BorderLayout(0, 0));
		}
		
		// create 64 label and add 64 label to 64 panel
		JLabel labelArray[] = new JLabel[64];
		for(int i = 0; i < 64; i++) {
			labelArray[i] = new JLabel("");
			arrayPanel[i].add(labelArray[i]);
			labelArray[i].setOpaque(false);
		}
		
	
	
		 
		// add even listener on label
		for(int i = 0; i < 64; i++) {
			labelArray[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					labelArray[1].setIcon(new ImageIcon("C:/Users/Gam/git/BattleshipGame/src/com/battleship/ui/ship.png")); //change the path to your image
					
					//centered the image on the label
					labelArray[1].setHorizontalAlignment(SwingConstants.CENTER);
					labelArray[1].setVerticalAlignment(SwingConstants.CENTER);
				}
			});
		}
		
		//spawning 3 ships 
		int numShips = 3;
		int shipsSunk =0;
		int boardSize = 7;
		int shipLength = 3;
		Model[] ships = new Model[numShips];
		do {
		for(int i=0; i<numShips;i++) {
			ships[i] = new Model(generateShip(boardSize, shipLength));
		}} while(collison(ships));
	
	}
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
			System.out.println("ships locations: ");
			System.out.println();
			for(String i : allLocs) {
				System.out.print(i + " ");
			}
			return false;
		}
}
