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
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Canvas;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class BattleshipGame {

	private JFrame frame;

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

	/**
	 * Create the application.
	 */
	public BattleshipGame() {
		initialize();
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
		
		JLayeredPane layeredPane = new JLayeredPane();
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
		
		JPanel panel_1 = new JPanel();
			
		JPanel panel_2 = new JPanel();
		
		JPanel panel_3 = new JPanel();
		
		JPanel panel_4 = new JPanel();

		JPanel panel_5 = new JPanel();
	
		JPanel panel_6 = new JPanel();
		
		JPanel panel_7 = new JPanel();
		
		JPanel panel_8 = new JPanel();
		
		JPanel panel_9 = new JPanel();
		
		JPanel panel_10 = new JPanel();
		
		JPanel panel_11 = new JPanel();
		
		JPanel panel_12 = new JPanel();
		
		JPanel panel_13 = new JPanel();
		
		JPanel panel_14 = new JPanel();

		JPanel panel_15 = new JPanel();
		
		JPanel panel_16 = new JPanel();
		
		JPanel panel_17 = new JPanel();
		
		JPanel panel_18 = new JPanel();
		
		JPanel panel_19 = new JPanel();
		
		JPanel panel_20 = new JPanel();
		
		JPanel panel_21 = new JPanel();
		
		JPanel panel_22 = new JPanel();
		
		JPanel panel_23 = new JPanel();
		
		JPanel panel_24 = new JPanel();
		
		JPanel panel_25 = new JPanel();
		
		JPanel panel_26 = new JPanel();
		
		JPanel panel_27 = new JPanel();
		
		JPanel panel_28 = new JPanel();
		
		JPanel panel_29 = new JPanel();
		
		JPanel panel_30 = new JPanel();
		
		JPanel panel_31 = new JPanel();
		
		JPanel panel_32 = new JPanel();
		
		JPanel panel_33 = new JPanel();
		
		JPanel panel_34 = new JPanel();
		
		JPanel panel_35 = new JPanel();
		
		JPanel panel_36 = new JPanel();
		
		JPanel panel_37 = new JPanel();
		
		JPanel panel_38 = new JPanel();
		
		JPanel panel_39 = new JPanel();
		
		JPanel panel_40 = new JPanel();
		
		JPanel panel_41 = new JPanel();
		
		JPanel panel_42 = new JPanel();
		
		JPanel panel_43 = new JPanel();
		
		JPanel panel_44 = new JPanel();
		
		JPanel panel_45 = new JPanel();

		JPanel panel_46 = new JPanel();
		
		JPanel panel_47 = new JPanel();
		
		JPanel panel_48 = new JPanel();
		
		JPanel panel_49 = new JPanel();
		
		JPanel panel_50 = new JPanel();
		
		JPanel panel_51 = new JPanel();
		
		JPanel panel_52 = new JPanel();
		
		JPanel panel_53 = new JPanel();
		
		JPanel panel_54 = new JPanel();
		
		JPanel panel_55 = new JPanel();
		
		JPanel panel_56 = new JPanel();
	
		JPanel panel_57 = new JPanel();
		
		JPanel panel_58 = new JPanel();
		
		JPanel panel_59 = new JPanel();
		
		JPanel panel_60 = new JPanel();
		
		JPanel panel_61 = new JPanel();
		
		JPanel panel_62 = new JPanel();
		
		JPanel panel_63 = new JPanel();
		
		JPanel panel_64 = new JPanel();
	
		

		
		JPanel arrayPanel[] = new JPanel[64];
		arrayPanel[0] = panel_1;
		arrayPanel[1] = panel_2;
		arrayPanel[2] = panel_3;
		arrayPanel[3] = panel_4;
		arrayPanel[4] = panel_5;
		arrayPanel[5] = panel_6;
		arrayPanel[6] = panel_7;
		arrayPanel[7] = panel_8;
		arrayPanel[8] = panel_9;
		arrayPanel[9] = panel_10;
		
		arrayPanel[10] = panel_11;
		arrayPanel[11] = panel_12;
		arrayPanel[12] = panel_13;
		arrayPanel[13] = panel_14;
		arrayPanel[14] = panel_15;
		arrayPanel[15] = panel_16;
		arrayPanel[16] = panel_17;
		arrayPanel[17] = panel_18;
		arrayPanel[18] = panel_19;
		arrayPanel[19] = panel_20;
		arrayPanel[20] = panel_21;
		
		arrayPanel[21] = panel_22;
		arrayPanel[22] = panel_23;
		arrayPanel[23] = panel_24;
		arrayPanel[24] = panel_25;
		arrayPanel[25] = panel_26;
		arrayPanel[26] = panel_27;
		arrayPanel[27] = panel_28;
		arrayPanel[28] = panel_29;
		arrayPanel[29] = panel_30;
		arrayPanel[30] = panel_31;
		
		arrayPanel[31] = panel_32;
		arrayPanel[32] = panel_33;
		arrayPanel[33] = panel_34;
		arrayPanel[34] = panel_35;
		arrayPanel[35] = panel_36;
		arrayPanel[36] = panel_37;
		arrayPanel[37] = panel_38;
		arrayPanel[38] = panel_39;
		arrayPanel[39] = panel_40;
		arrayPanel[40] = panel_41;
		
		arrayPanel[41] = panel_42;
		arrayPanel[42] = panel_43;
		arrayPanel[43] = panel_44;
		arrayPanel[44] = panel_45;
		arrayPanel[45] = panel_46;
		arrayPanel[46] = panel_47;
		arrayPanel[47] = panel_48;
		arrayPanel[48] = panel_49;
		arrayPanel[49] = panel_50;
		arrayPanel[50] = panel_51;
		
		
		arrayPanel[51] = panel_52;
		arrayPanel[52] = panel_53;
		arrayPanel[53] = panel_54;
		arrayPanel[54] = panel_55;
		arrayPanel[55] = panel_56;
		arrayPanel[56] = panel_57;
		arrayPanel[57] = panel_58;
		arrayPanel[58] = panel_59;
		arrayPanel[59] = panel_60;
		arrayPanel[60] = panel_61;
		arrayPanel[61] = panel_62;
		arrayPanel[62] = panel_63;
		arrayPanel[63] = panel_64;
		
		

		for(int i = 0; i < 64; i++) {
			arrayPanel[i].setBorder(new LineBorder(new Color(0, 0, 0)));
			arrayPanel[i].setOpaque(false);
			panel.add(arrayPanel[i]);
			arrayPanel[i].setLayout(new BorderLayout(0, 0));
		}
		
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
		
		


	}

}
