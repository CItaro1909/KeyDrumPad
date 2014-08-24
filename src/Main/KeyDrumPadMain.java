package Main;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

import GUI.Hauptfenster;

public class KeyDrumPadMain extends JFrame
{
	private static final long serialVersionUID = 1L;

	//	MAIN
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException 
	{
		System.out.println("start");
		new Hauptfenster();	//Jetzt gehts looos
	}
	//	MAIN Ende
	
}
