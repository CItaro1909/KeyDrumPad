package GUI;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Hauptfenster extends JFrame 
{
	private static final long serialVersionUID = 1L;
	
	/**
	 * konstuktor blabla
	 */
	public Hauptfenster()
	{
		super();
		initialisieren(2);
	}
	
	/**
	 * initialisert das fenster
	 * @param a zum testen von javadoc
	 */
	
	
	public void initialisieren(int a)
	{
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		this.setTitle("KeyDrumPad");
		this.setSize(600, 400);
		
		//Groesse wird automatisch angepasst
		//pack();
	
		Pad testpad = new Pad(0, 0, 'd');
		this.add(testpad);
		
		this.setResizable(false);
		this.setLocationRelativeTo(rootPane);
		setVisible(true);	
		
		
	}
}