package GUI;

import java.awt.Dimension;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Hauptfenster extends JFrame 
{
	private static final long serialVersionUID = 1L;
	
	private JPanel panel_AufnahmeSteuerung;
		private JButton button_AufnahmeSteuerung_Aufnahme;
		private JButton button_AufnahmeSteuerung_Play;
		private JButton button_AufnahmeSteuerung_Pause;
		private JButton button_AufnahmeSteuerung_Stop;
		private JLabel label_AufnahmeSteuerung_Zeit;
	
	private JPanel panel_Einstellungen;
		private JButton button_Einstellungen_TogglePadBearbeiten;
		private JButton button_Einstellungen_SetSpeichern;
		private JTextField textfeld_Einstellungen_SetSpeichern;
		private JLabel label_Einstellungen_SetSpeichern;
	
	private JPanel panel_Sets;
		private Pad[] pads= new Pad[46];	//TODO in set klasse verschieben
	
	/**
	 * konstuktor blabla
	 * @throws LineUnavailableException 
	 * @throws IOException 
	 * @throws UnsupportedAudioFileException 
	 */
	public Hauptfenster() throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		super();
		initialisieren();
	}
	
	/**
	 * initialisert das fenster
	 * @param a zum testen von javadoc
	 * @throws LineUnavailableException 
	 * @throws IOException 
	 * @throws UnsupportedAudioFileException 
	 */
	
	
	public void initialisieren() throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		this.setTitle("KeyDrumPad");
		this.setMinimumSize(new Dimension(1300, 700));
		this.setExtendedState(MAXIMIZED_BOTH);
		
		Pad testpad = new Pad(0, 200, 'd', "instrument1.wav");
		this.add(testpad);
		
		//this.setResizable(false);
		this.setLocationRelativeTo(rootPane);
		setVisible(true);	
		
	}
}