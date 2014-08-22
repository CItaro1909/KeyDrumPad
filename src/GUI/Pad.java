package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class Pad extends JButton implements ActionListener, KeyListener, MouseListener {

	private String soundDatei;
	private Color hintergrundFarbe;
	private double lautstaerke;
	private String padName;
	private char tastenkuerzel;
	private boolean padDruckDauerhaft;
	private boolean soundSpieltAb = false;
	
	/**
	 * Ein Pad ist ein Button der einen Ton abspielt beim Druck von Tastenkürzel oder Mausklick
	 * @param xpos beschreibt die X-Position von einem Pad
	 * @param ypos beschreibt die Y-Position von einem Pad
	 * @param tastenkuerzel = Buchstabe auf der Tastatur
	 */
	public Pad(int xpos, int ypos, char tastenkuerzel)
	{
		super();
		this.setBounds(xpos, ypos, 60, 60);
		this.padName="";
		this.hintergrundFarbe=Color.LIGHT_GRAY;
		this.lautstaerke=50;
		this.tastenkuerzel=tastenkuerzel;
		this.soundDatei="";
		
		this.addActionListener(this);
		this.addKeyListener(this);
		this.addMouseListener(this);
	}
	
	/**
	 * Sound soll abgespielt werden beim Tastendrücken oder Mausklicken
	 */
	public void soundAbspielen()
	{		
		if(soundSpieltAb == false)
		{
			System.out.println("Ab gehts");
			soundSpieltAb = true;
		}		
	}
	public void soundStopp()
	{
		soundSpieltAb = false;
		System.out.println("gestoppt");
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar()==this.tastenkuerzel)
		{
			soundAbspielen();
		}	
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyChar()==this.tastenkuerzel)
		{
			soundStopp();
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
			soundAbspielen();
		}	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		soundStopp();
	}
}
