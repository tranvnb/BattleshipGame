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
		frame.setBounds(100, 100, 937, 666);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(8, 8, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblA = new JLabel("A\r\n");
		lblA.setBackground(Color.GRAY);
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_1.add(lblA);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btnA0 = new JButton("A0");
		btnA0.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_2.add(btnA0, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btnA1 = new JButton("A1");
		btnA1.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_3.add(btnA1, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton btnA2 = new JButton("A2");
		btnA2.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_4.add(btnA2, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton btnA3 = new JButton("A3");
		btnA3.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_5.add(btnA3, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btnA4 = new JButton("A4");
		btnA4.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_6.add(btnA4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btnA5 = new JButton("A5");
		btnA5.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_7.add(btnA5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btnA6 = new JButton("A6");
		btnA6.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_8.add(btnA6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblB = new JLabel("B");
		lblB.setBackground(Color.LIGHT_GRAY);
		lblB.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblB);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JButton btnB0 = new JButton("B0");
		btnB0.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_10.add(btnB0, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton btnB1 = new JButton("B1");
		btnB1.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_11.add(btnB1, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton btnB2 = new JButton("B2");
		btnB2.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_12.add(btnB2, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton btnB3 = new JButton("B3");
		btnB3.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_13.add(btnB3, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton btnB4 = new JButton("B4");
		btnB4.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_14.add(btnB4, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btnB5 = new JButton("B5");
		btnB5.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_15.add(btnB5, BorderLayout.CENTER);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		JButton btnB6 = new JButton("B6");
		btnB6.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_16.add(btnB6, BorderLayout.CENTER);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_17);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		JLabel lblC = new JLabel("C");
		lblC.setBackground(Color.LIGHT_GRAY);
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_17.add(lblC);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_18);
		panel_18.setLayout(new BorderLayout(0, 0));
		
		JButton btnC0 = new JButton("C0");
		btnC0.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_18.add(btnC0, BorderLayout.CENTER);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_19);
		panel_19.setLayout(new BorderLayout(0, 0));
		
		JButton btnC1 = new JButton("C1");
		btnC1.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_19.add(btnC1, BorderLayout.CENTER);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_20);
		panel_20.setLayout(new BorderLayout(0, 0));
		
		JButton btnC2 = new JButton("C2");
		btnC2.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_20.add(btnC2, BorderLayout.CENTER);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_21);
		panel_21.setLayout(new BorderLayout(0, 0));
		
		JButton btnC3 = new JButton("C3");
		btnC3.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_21.add(btnC3, BorderLayout.CENTER);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_22);
		panel_22.setLayout(new BorderLayout(0, 0));
		
		JButton btnC4 = new JButton("C4");
		btnC4.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_22.add(btnC4, BorderLayout.CENTER);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_23);
		panel_23.setLayout(new BorderLayout(0, 0));
		
		JButton btnC5 = new JButton("C5");
		btnC5.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_23.add(btnC5, BorderLayout.CENTER);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_24);
		panel_24.setLayout(new BorderLayout(0, 0));
		
		JButton btnC6 = new JButton("C6");
		btnC6.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_24.add(btnC6, BorderLayout.CENTER);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_25);
		panel_25.setLayout(new BorderLayout(0, 0));
		
		JLabel lblD = new JLabel("D");
		lblD.setBackground(Color.LIGHT_GRAY);
		lblD.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		panel_25.add(lblD);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_26);
		panel_26.setLayout(new BorderLayout(0, 0));
		
		JButton btnD0 = new JButton("D0");
		btnD0.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_26.add(btnD0, BorderLayout.CENTER);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_27);
		panel_27.setLayout(new BorderLayout(0, 0));
		
		JButton btnD1 = new JButton("D1");
		btnD1.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_27.add(btnD1, BorderLayout.CENTER);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_28);
		panel_28.setLayout(new BorderLayout(0, 0));
		
		JButton btnD2 = new JButton("D2");
		btnD2.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_28.add(btnD2, BorderLayout.CENTER);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_29);
		panel_29.setLayout(new BorderLayout(0, 0));
		
		JButton btnD3 = new JButton("D3");
		btnD3.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_29.add(btnD3, BorderLayout.CENTER);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_30);
		panel_30.setLayout(new BorderLayout(0, 0));
		
		JButton btnD4 = new JButton("D4");
		btnD4.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_30.add(btnD4, BorderLayout.CENTER);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_31);
		panel_31.setLayout(new BorderLayout(0, 0));
		
		JButton btnD5 = new JButton("D5");
		btnD5.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_31.add(btnD5, BorderLayout.CENTER);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_32);
		panel_32.setLayout(new BorderLayout(0, 0));
		
		JButton btnD6 = new JButton("D6");
		btnD6.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_32.add(btnD6, BorderLayout.CENTER);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_33);
		panel_33.setLayout(new BorderLayout(0, 0));
		
		JLabel lblE = new JLabel("E");
		lblE.setBackground(Color.LIGHT_GRAY);
		lblE.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblE.setHorizontalAlignment(SwingConstants.CENTER);
		panel_33.add(lblE);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_34);
		panel_34.setLayout(new BorderLayout(0, 0));
		
		JButton btnE0 = new JButton("E0");
		btnE0.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_34.add(btnE0, BorderLayout.CENTER);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_35);
		panel_35.setLayout(new BorderLayout(0, 0));
		
		JButton btnE1 = new JButton("E1");
		btnE1.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_35.add(btnE1, BorderLayout.CENTER);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_36);
		panel_36.setLayout(new BorderLayout(0, 0));
		
		JButton btnE2 = new JButton("E2");
		btnE2.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_36.add(btnE2, BorderLayout.CENTER);
		
		JPanel panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_37);
		panel_37.setLayout(new BorderLayout(0, 0));
		
		JButton btnE3 = new JButton("E3");
		btnE3.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_37.add(btnE3, BorderLayout.CENTER);
		
		JPanel panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_38);
		panel_38.setLayout(new BorderLayout(0, 0));
		
		JButton btnE4 = new JButton("E4");
		btnE4.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_38.add(btnE4, BorderLayout.CENTER);
		
		JPanel panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_39);
		panel_39.setLayout(new BorderLayout(0, 0));
		
		JButton btnE5 = new JButton("E5");
		btnE5.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_39.add(btnE5, BorderLayout.CENTER);
		
		JPanel panel_40 = new JPanel();
		panel_40.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_40);
		panel_40.setLayout(new BorderLayout(0, 0));
		
		JButton btnE6 = new JButton("E6");
		btnE6.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_40.add(btnE6, BorderLayout.CENTER);
		
		JPanel panel_41 = new JPanel();
		panel_41.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_41);
		panel_41.setLayout(new BorderLayout(0, 0));
		
		JLabel lblF = new JLabel("F");
		lblF.setBackground(Color.LIGHT_GRAY);
		lblF.setHorizontalAlignment(SwingConstants.CENTER);
		lblF.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_41.add(lblF);
		
		JPanel panel_42 = new JPanel();
		panel_42.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_42);
		panel_42.setLayout(new BorderLayout(0, 0));
		
		JButton btnF0 = new JButton("F0");
		btnF0.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_42.add(btnF0, BorderLayout.CENTER);
		
		JPanel panel_43 = new JPanel();
		panel_43.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_43);
		panel_43.setLayout(new BorderLayout(0, 0));
		
		JButton btnF1 = new JButton("F1");
		btnF1.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_43.add(btnF1, BorderLayout.CENTER);
		
		JPanel panel_44 = new JPanel();
		panel_44.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_44);
		panel_44.setLayout(new BorderLayout(0, 0));
		
		JButton btnF2 = new JButton("F2");
		btnF2.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_44.add(btnF2, BorderLayout.CENTER);
		
		JPanel panel_45 = new JPanel();
		panel_45.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_45);
		panel_45.setLayout(new BorderLayout(0, 0));
		
		JButton btnF3 = new JButton("F3");
		btnF3.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_45.add(btnF3, BorderLayout.CENTER);
		
		JPanel panel_46 = new JPanel();
		panel_46.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_46);
		panel_46.setLayout(new BorderLayout(0, 0));
		
		JButton btnF4 = new JButton("F4");
		btnF4.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_46.add(btnF4, BorderLayout.CENTER);
		
		JPanel panel_47 = new JPanel();
		panel_47.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_47);
		panel_47.setLayout(new BorderLayout(0, 0));
		
		JButton btnF5 = new JButton("F5");
		btnF5.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_47.add(btnF5, BorderLayout.CENTER);
		
		JPanel panel_48 = new JPanel();
		panel_48.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_48);
		panel_48.setLayout(new BorderLayout(0, 0));
		
		JButton btnF6 = new JButton("F6");
		btnF6.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_48.add(btnF6, BorderLayout.CENTER);
		
		JPanel panel_49 = new JPanel();
		panel_49.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_49);
		panel_49.setLayout(new BorderLayout(0, 0));
		
		JLabel lblG = new JLabel("G");
		lblG.setBackground(Color.LIGHT_GRAY);
		lblG.setHorizontalAlignment(SwingConstants.CENTER);
		lblG.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_49.add(lblG);
		
		JPanel panel_50 = new JPanel();
		panel_50.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_50);
		panel_50.setLayout(new BorderLayout(0, 0));
		
		JButton btnG0 = new JButton("G0");
		btnG0.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_50.add(btnG0, BorderLayout.CENTER);
		
		JPanel panel_51 = new JPanel();
		panel_51.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_51);
		panel_51.setLayout(new BorderLayout(0, 0));
		
		JButton btnG1 = new JButton("G1");
		btnG1.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_51.add(btnG1, BorderLayout.CENTER);
		
		JPanel panel_52 = new JPanel();
		panel_52.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_52);
		panel_52.setLayout(new BorderLayout(0, 0));
		
		JButton btnG2 = new JButton("G2");
		btnG2.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_52.add(btnG2, BorderLayout.CENTER);
		
		JPanel panel_53 = new JPanel();
		panel_53.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_53);
		panel_53.setLayout(new BorderLayout(0, 0));
		
		JButton btnG3 = new JButton("G3");
		btnG3.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_53.add(btnG3, BorderLayout.CENTER);
		
		JPanel panel_54 = new JPanel();
		panel_54.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_54);
		panel_54.setLayout(new BorderLayout(0, 0));
		
		JButton btnG4 = new JButton("G4");
		btnG4.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_54.add(btnG4, BorderLayout.CENTER);
		
		JPanel panel_55 = new JPanel();
		panel_55.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_55);
		panel_55.setLayout(new BorderLayout(0, 0));
		
		JButton btnG5 = new JButton("G5");
		btnG5.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_55.add(btnG5, BorderLayout.CENTER);
		
		JPanel panel_56 = new JPanel();
		panel_56.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_56);
		panel_56.setLayout(new BorderLayout(0, 0));
		
		JButton btnG6 = new JButton("G6");
		btnG6.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_56.add(btnG6, BorderLayout.CENTER);
		
		JPanel panel_57 = new JPanel();
		panel_57.setBackground(Color.LIGHT_GRAY);
		panel_57.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_57);
		panel_57.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_58 = new JPanel();
		panel_58.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_58);
		panel_58.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl0 = new JLabel("0");
		lbl0.setBackground(Color.LIGHT_GRAY);
		lbl0.setHorizontalAlignment(SwingConstants.CENTER);
		lbl0.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_58.add(lbl0);
		
		JPanel panel_59 = new JPanel();
		panel_59.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_59);
		panel_59.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl1 = new JLabel("1");
		lbl1.setBackground(Color.LIGHT_GRAY);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_59.add(lbl1);
		
		JPanel panel_60 = new JPanel();
		panel_60.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_60);
		panel_60.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl2 = new JLabel("2");
		lbl2.setBackground(Color.LIGHT_GRAY);
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_60.add(lbl2);
		
		JPanel panel_61 = new JPanel();
		panel_61.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_61);
		panel_61.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl3 = new JLabel("3");
		lbl3.setBackground(Color.LIGHT_GRAY);
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_61.add(lbl3);
		
		JPanel panel_62 = new JPanel();
		panel_62.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_62);
		panel_62.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl4 = new JLabel("4");
		lbl4.setBackground(Color.LIGHT_GRAY);
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_62.add(lbl4);
		
		JPanel panel_63 = new JPanel();
		panel_63.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_63);
		panel_63.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl5 = new JLabel("5");
		lbl5.setBackground(Color.LIGHT_GRAY);
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_63.add(lbl5);
		
		JPanel panel_64 = new JPanel();
		panel_64.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_64);
		panel_64.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl6 = new JLabel("6");
		lbl6.setBackground(Color.LIGHT_GRAY);
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_64.add(lbl6);
	}

}
