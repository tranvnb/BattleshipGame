package com.battleship.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class GameTimer extends JPanel{

	private final JLabel introTimerLabel;
	private final JLabel timerLabel;
	private final JLayeredPane gameBoard;
	private long startTime = 0L;
	private final long GAME_TIME = 5;
	private CallbackFunction callback;

	public GameTimer(JLayeredPane gameBoard, CallbackFunction callback) throws HeadlessException {
		super();
		this.callback = callback;
		
		this.gameBoard = gameBoard;		
		this.setBounds(30, 30, 200, 100);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
//		this.setBorder(new LineBorder(new Color(0, 0, 0), 2));

		introTimerLabel = new JLabel();
		introTimerLabel.setPreferredSize(new Dimension(200, 20));
		introTimerLabel.setText("You have " + GAME_TIME + " seconds for this game");
		this.add(introTimerLabel);
		
		
		this.timerLabel = new JLabel();
		this.timerLabel.setText("This is timer for game");
//		this.timerLabel.setPreferredSize(new Dimension(200, 20));
		this.add(timerLabel);
		
		if (this.gameBoard != null) {			
			this.gameBoard.add(this);
		}
		
		startTime = (new Date()).getTime();
		startGame();
	}
	
	public void startGame() {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				long elapsedTime = (new Date()).getTime() - startTime;
				timerLabel.setText((elapsedTime / 1000) + " Seconds");
				if (elapsedTime / 1000 >= GAME_TIME) {
					timerLabel.setText("You Lose!");
					timer.cancel();
					timer.purge();
					callback.endGame();
				}
			}
		}, 0, 1000);
	}
	
	public interface CallbackFunction {
		public void endGame();
	}
	
}
