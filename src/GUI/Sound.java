package GUI;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



public class Sound {
	
	private URL pfad;
	private Clip clip;
	private AudioFormat af;
	private int size;
	private byte[] audio;
	AudioInputStream ais;
	
	
	/**
	 * Der Dateiname wird an Sound übergeben und abgespielt
	 * @param dateiname
	 * @throws UnsupportedAudioFileException
	 * @throws IOException
	 * @throws LineUnavailableException
	 */
	public Sound(String dateiname) throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		ais= AudioSystem.getAudioInputStream(new File(dateiname));
		BufferedInputStream bis= new BufferedInputStream(ais);
		af= ais.getFormat();
		
		size=(int) (af.getFrameSize() * ais.getFrameLength());
		audio= new byte[size];
		DataLine.Info info= new DataLine.Info(Clip.class, af, size);
		bis.read(audio, 0, size);
		clip= (Clip)AudioSystem.getLine(info);
		clip.open(af, audio, 0, size);
		clip.start();
	}
	
	/*public void play() throws LineUnavailableException
	{
		clip.start();
	}*/
	
	/**
	 * Der Sound bzw. Clip wird gestoppt
	 * @throws IOException
	 */
	public void stopp() throws IOException
	{
		clip.stop();
	}
}
