package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;

public class Pad extends JButton implements ActionListener, KeyListener, MouseListener {

	private Sound soundDatei;
	private String soundDatei_name;
	
	private Color hintergrundFarbe;
	private double lautstaerke;
	private String padName;
	private char tastenkuerzel;
	private boolean padDruckDauerhaft=true;
	private boolean soundSpieltAb = false;
	
	/**
	 * Ein Pad ist ein Button der einen Ton abspielt beim Druck von Tastenkürzel oder Mausklick
	 * @param xpos beschreibt die X-Position von einem Pad
	 * @param ypos beschreibt die Y-Position von einem Pad
	 * @param tastenkuerzel = Buchstabe auf der Tastatur
	 * @throws LineUnavailableException 
	 * @throws IOException 
	 * @throws UnsupportedAudioFileException 
	 */
	public Pad(int xpos, int ypos, char tastenkuerzel, String dateiname) throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		super();
		this.setBounds(xpos, ypos, 60, 60);
		this.padName="";
		this.hintergrundFarbe=Color.LIGHT_GRAY;
		this.lautstaerke=50;
		this.tastenkuerzel=tastenkuerzel;
		this.soundDatei_name="sounds/"+dateiname;
		//this.soundDatei=new Sound("sounds/instrument1.wav");
		
		this.addActionListener(this);
		this.addKeyListener(this);
		this.addMouseListener(this);
	}
	
	/**
	 * Sound soll abgespielt werden beim Tastendrücken oder Mausklicken
	 * @throws LineUnavailableException 
	 * @throws IOException 
	 * @throws UnsupportedAudioFileException 
	 */
	public void soundAbspielen() throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{		
		if(soundSpieltAb == false)
		{
			this.soundDatei=new Sound(this.soundDatei_name);
			soundSpieltAb = true;
		}
	}
	public void soundStopp() throws IOException
	{
		if(this.padDruckDauerhaft==true)
		{
			this.soundDatei.stopp();
		}
		else{
			
		}
		soundSpieltAb = false;
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar()==this.tastenkuerzel)
		{
			try {
				soundAbspielen();
			} catch (UnsupportedAudioFileException | IOException
					| LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}	
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyChar()==this.tastenkuerzel)
		{
			try {
				soundStopp();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
				
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == this)
		{
				try {
					soundAbspielen();
				} catch (UnsupportedAudioFileException | IOException
						| LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		try {
			soundStopp();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
