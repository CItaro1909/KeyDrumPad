package Main;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GUIs extends JFrame 
{
	private static final long serialVersionUID = 1L;
		
public GUIs(){
		super();
		initialisieren();
	}
	public void initialisieren()
	{
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		this.setTitle("KeyDrumPad");
		this.setSize(1366, 768);
		
		//Groesse wird automatisch angepasst
		//pack();
		
		this.setResizable(false);
		this.setLocationRelativeTo(rootPane);
		setVisible(true);		
	}
}