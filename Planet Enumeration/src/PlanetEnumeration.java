import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.JToggleButton;
import java.awt.BorderLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import java.awt.Panel;
import java.awt.Choice;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PlanetEnumeration {

	private JFrame frmPlanetEnum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlanetEnumeration window = new PlanetEnumeration();
					window.frmPlanetEnum.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	
		private void initialize() {
			frmPlanetEnum = new JFrame();
			frmPlanetEnum.setForeground(Color.BLACK);
			frmPlanetEnum.setTitle("Planet Enumeration");
			frmPlanetEnum.setBounds(100, 100, 257, 362);
			frmPlanetEnum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmPlanetEnum.getContentPane().setLayout(null);
			
			JButton btnMercury = new JButton("Mercury");
			btnMercury.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//set the value of the planet
					EnumTest planet = new EnumTest(Planets.MERCURY);
					//call the function to display the message box
					planet.displayName();
					
				}
			});
			btnMercury.setBackground(new Color(192, 192, 192));
			btnMercury.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnMercury.setBounds(62, 51, 89, 23);
			frmPlanetEnum.getContentPane().add(btnMercury);
			
			JButton btnVenus = new JButton("Venus");
			btnVenus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//set the value of the planet
					EnumTest planet = new EnumTest(Planets.VENUS);
					//call the function to display the message box
					planet.displayName();
				}
			});
			btnVenus.setBackground(new Color(189, 183, 107));
			btnVenus.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnVenus.setBounds(62, 85, 89, 23);
			frmPlanetEnum.getContentPane().add(btnVenus);
			
			JButton btnEarth = new JButton("Earth");
			btnEarth.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//set the value of the planet
					EnumTest planet = new EnumTest(Planets.EARTH);
					//call the function to display the message box
					planet.displayName();
				}
			});
			btnEarth.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnEarth.setBackground(new Color(107, 142, 35));
			btnEarth.setBounds(62, 119, 89, 23);
			frmPlanetEnum.getContentPane().add(btnEarth);
			
			JButton btnMars = new JButton("Mars");
			btnMars.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//set the value of the planet
					EnumTest planet = new EnumTest(Planets.MARS);
					//call the function to display the message box
					planet.displayName();
				}
			});
			btnMars.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnMars.setBackground(new Color(178, 34, 34));
			btnMars.setBounds(62, 153, 89, 23);
			frmPlanetEnum.getContentPane().add(btnMars);
			
			JButton btnJupiter = new JButton("Jupiter");
			btnJupiter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//set the value of the planet
					EnumTest planet = new EnumTest(Planets.JUPITER);
					//call the function to display the message box
					planet.displayName();
				}
			});
			btnJupiter.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnJupiter.setBackground(new Color(222, 184, 135));
			btnJupiter.setBounds(62, 187, 89, 23);
			frmPlanetEnum.getContentPane().add(btnJupiter);
			
			JButton btnSaturn = new JButton("Saturn");
			btnSaturn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//set the value of the planet
					EnumTest planet = new EnumTest(Planets.SATURN);
					//call the function to display the message box
					planet.displayName();
				}
			});
			btnSaturn.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnSaturn.setBackground(new Color(218, 165, 32));
			btnSaturn.setBounds(62, 221, 89, 23);
			frmPlanetEnum.getContentPane().add(btnSaturn);
			
			JButton btnUranus = new JButton("Uranus");
			btnUranus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//set the value of the planet
					EnumTest planet = new EnumTest(Planets.URANUS);
					//call the function to display the message box
					planet.displayName();
				}
			});
			btnUranus.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnUranus.setBackground(new Color(224, 255, 255));
			btnUranus.setBounds(62, 255, 89, 23);
			frmPlanetEnum.getContentPane().add(btnUranus);
			
			JButton btnNeptune = new JButton("Neptune");
			btnNeptune.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//set the value of the planet
					EnumTest planet = new EnumTest(Planets.NEPTUNE);
					//call the function to display the message box
					planet.displayName();
				}
			});
			btnNeptune.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnNeptune.setBackground(new Color(135, 206, 235));
			btnNeptune.setBounds(62, 289, 89, 23);
			frmPlanetEnum.getContentPane().add(btnNeptune);
			
			JLabel lblInstr = new JLabel(" Click on the planet \r\nyou would like to go");
			lblInstr.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblInstr.setBounds(10, 0, 231, 42);
			frmPlanetEnum.getContentPane().add(lblInstr);
		}
	 

	public PlanetEnumeration() {
		initialize();
	}
	
	//enumerate the planets
	public enum Planets
	{
		MERCURY(1),
		VENUS(2),
		EARTH(3),
		MARS(4),
		JUPITER(5),
		SATURN(6),
		URANUS(7),
		NEPTUNE(8);	
		
		private int order; 
		Planets(int order)
		{
			this.order = order;
		}
		
		public int returnValue()
		{
			return order;
		}
	}
	
	//create a public class EnumTest
	public class EnumTest{
		//create a new object
		Planets planet;
		//get the planets when a new object is created and the name is passed as an argument
		public EnumTest (Planets passPlanet) {
			this.planet = passPlanet;
		}
		
		public void displayName()
		{
			//check what is planet, then display the name of the planet and its order
			switch(planet) {
			
			case MERCURY:
				JOptionPane.showMessageDialog(null, "You would like to go to Mercury, planet #" + planet.returnValue());	
				break;
			case VENUS:
				JOptionPane.showMessageDialog(null, "You would like to go to Venus, planet #" + planet.returnValue());	
				break;
			case EARTH:
				JOptionPane.showMessageDialog(null, "You would like to stay on the Earth");	
				break;
			case MARS: 
				JOptionPane.showMessageDialog(null, "You would like to got to Mars, planet #" + planet.returnValue());	
				break;
			case JUPITER: 
				JOptionPane.showMessageDialog(null, "You would like to got to Jupiter, planet #" + planet.returnValue());	
				break;
			case SATURN: 
				JOptionPane.showMessageDialog(null, "You would like to got to Saturn, planet #" + planet.returnValue());	
				break;
			case URANUS: 
				JOptionPane.showMessageDialog(null, "You would like to got to Uranus, planet #" + planet.returnValue());	
				break;
			case NEPTUNE: 
				JOptionPane.showMessageDialog(null, "You would like to got to Neptune, planet #" + planet.returnValue());	
				break;
			}
		}

	}
	


}
