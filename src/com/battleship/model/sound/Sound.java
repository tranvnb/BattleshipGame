package com.battleship.model.sound;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public abstract class Sound implements LineListener {

	private String soundFilePath;
	private SoundCallbackFunction callback;
	private AudioInputStream audioInputStream;
	private Clip clip;
	private File file;

	public Sound(String soundFilePath) {
		this.soundFilePath = soundFilePath;
		try {
			initSound();
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		}
	}

	public Sound(String soundFilePath, SoundCallbackFunction callback) {
		this.soundFilePath = soundFilePath;
		this.callback = callback;
	}

	private void initSound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		if (!soundFilePath.isEmpty()) {

			Line.Info linfo = new Line.Info(Clip.class);
			Line line = AudioSystem.getLine(linfo);
			clip = (Clip) line;
			clip.addLineListener(this);
			file = new File(soundFilePath).getAbsoluteFile();
			audioInputStream = AudioSystem.getAudioInputStream(file);
			clip.open(audioInputStream);
		} else {
			System.out.println("file path is empty");
		}
	}

	public void play() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

		if (clip == null) {
			initSound();
		} else {
			clip.setMicrosecondPosition(0);
			clip.start();
		}
	}

	@Override
	public void update(LineEvent event) {
		LineEvent.Type type = event.getType();
		if (type == LineEvent.Type.STOP) {
			if (this.callback != null) {
				this.callback.actionAfterSound();
			}
		}
	}

	public void setCallback(SoundCallbackFunction callback) {
		this.callback = callback;
	}

	@Override
	protected void finalize() throws IOException {
		clip.stop();
		clip.close();
		audioInputStream.close();
	}

	public interface SoundCallbackFunction {
		public void actionAfterSound();
	}

}
