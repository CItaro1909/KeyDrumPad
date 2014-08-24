package GUI;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Hauptfenster extends JFrame 
{
	private static final long serialVersionUID = 1L;
	
	/**
	 * konstuktor blabla
	 * @throws LineUnavailableException 
	 * @throws IOException 
	 * @throws UnsupportedAudioFileException 
	 */
	public Hauptfenster() throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		super();
		initialisieren(2);
	}
	
	/**
	 * initialisert das fenster
	 * @param a zum testen von javadoc
	 * @throws LineUnavailableException 
	 * @throws IOException 
	 * @throws UnsupportedAudioFileException 
	 */
	
	
	public void initialisieren(int a) throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		this.setTitle("KeyDrumPad");
		this.setSize(600, 400);
		
		//Groesse wird automatisch angepasst
		//pack();
	
		Pad testpad = new Pad(0, 0, 'd', "instrument1.wav");
		this.add(testpad);
		
		this.setResizable(false);
		this.setLocationRelativeTo(rootPane);
		setVisible(true);	
		
		
	}
}