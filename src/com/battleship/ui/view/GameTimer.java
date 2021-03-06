package com.battleship.ui.view;

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
import java.awt.Font;
import java.awt.SystemColor;

public class GameTimer extends JPanel{

	private final JLabel introTimerLabel;
	private final JLabel timerLabel;
	private final JLayeredPane gameBoard;
	private long startTime = 0L;
	private final static int GAME_TIME = 60;
	private final int FONT_SIZE = 20;
	private final int WIDTH_OF_TIME_PANEL = 350;
	private final int HEIGHT_OF_TEXT = 30;
	private EndGameCallBackFunction callback;
	private int gameTime;

	public GameTimer(JLayeredPane gameBoard, EndGameCallBackFunction callback) throws HeadlessException {
		this(gameBoard,GAME_TIME, callback);
	}
	
	public GameTimer(JLayeredPane gameBoard, int gameTime, EndGameCallBackFunction callback) throws HeadlessException {
		super();
		this.callback = callback;
		this.gameTime = gameTime;
		
		this.gameBoard = gameBoard;		
		this.setBounds(30, 30, WIDTH_OF_TIME_PANEL, HEIGHT_OF_TEXT + 100);
		this.setOpaque(false);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		introTimerLabel = new JLabel();
		introTimerLabel.setForeground(Color.GREEN);
		introTimerLabel.setFont(new Font(introTimerLabel.getFont().getName(), introTimerLabel.getFont().getStyle(), FONT_SIZE));
		introTimerLabel.setPreferredSize(new Dimension(WIDTH_OF_TIME_PANEL, HEIGHT_OF_TEXT));
		introTimerLabel.setText("You have " + this.gameTime + " seconds for this game");
		this.add(introTimerLabel);
		
		
		this.timerLabel = new JLabel();
		timerLabel.setForeground(Color.GREEN);
		timerLabel.setFont(new Font(timerLabel.getFont().getName(), introTimerLabel.getFont().getStyle() | Font.BOLD, FONT_SIZE));
		this.timerLabel.setText("This is timer for game");
		introTimerLabel.setPreferredSize(new Dimension(WIDTH_OF_TIME_PANEL, HEIGHT_OF_TEXT));
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
				if (elapsedTime / 1000 >= gameTime) {
					timerLabel.setText("You Lose!");
					timer.cancel();
					timer.purge();
					if (callback != null) {
						callback.endGame();
					}
				}
			}
		}, 0, 1000);
	}
	
	public interface EndGameCallBackFunction {
		public void endGame();
	}
	
}
