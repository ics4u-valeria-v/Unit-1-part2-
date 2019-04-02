import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class RockPaperScissors {

	//declare global variables and constants
	static int ROCK = 1;
	static int PAPER = 2;
	static int SCISSORS = 3;
	int userChoice = 0;
	int compChoice = 0;
	int max = 3;
	int min = 1;
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RockPaperScissors window = new RockPaperScissors();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RockPaperScissors() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(0, 128, 128));
		frame.setForeground(new Color(0, 0, 205));
		frame.getContentPane().setBackground(new Color(184, 134, 11));
		frame.setBounds(100, 100, 514, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel grbPlayer = new JPanel();
		grbPlayer.setBackground(new Color(184, 134, 11));
		grbPlayer.setBounds(31, 34, 185, 390);
		frame.getContentPane().add(grbPlayer);
		grbPlayer.setLayout(null);
		
		JLabel lblPlayer = new JLabel("Player's Choice");
		lblPlayer.setForeground(new Color(255, 255, 255));
		lblPlayer.setFont(new Font("Kozuka Gothic Pr6N B", Font.BOLD, 16));
		lblPlayer.setBounds(10, 27, 164, 22);
		grbPlayer.add(lblPlayer);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 177, 151, 95);
		grbPlayer.add(panel);
		panel.setBackground(new Color(184, 134, 11));
		panel.setLayout(null);
		
		JRadioButton radUserPaper = new JRadioButton("");
		radUserPaper.setBounds(6, 27, 21, 23);
		panel.add(radUserPaper);
		radUserPaper.setBackground(new Color(184, 134, 11));
		
		JLabel picPaperC = new JLabel("");
		picPaperC.setBounds(33, 0, 115, 92);
		panel.add(picPaperC);
		picPaperC.setIcon(new ImageIcon("N:\\a\\Sem2-Winter2019\\ICS4U Programming\\Veverita, Valeria (s449619)\\Unit 1(part2)\\Rock, paper, scissors\\Images\\paper2.png"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(184, 134, 11));
		panel_2.setBounds(10, 71, 151, 95);
		grbPlayer.add(panel_2);
		
		JRadioButton radUserRock = new JRadioButton("");

		radUserRock.setBackground(new Color(184, 134, 11));
		radUserRock.setBounds(6, 27, 21, 23);
		panel_2.add(radUserRock);
		
		JLabel picRock = new JLabel("");
		picRock.setIcon(new ImageIcon("N:\\a\\Sem2-Winter2019\\ICS4U Programming\\Veverita, Valeria (s449619)\\Unit 1(part2)\\Rock, paper, scissors\\Images\\rock2.png"));
		picRock.setBounds(36, 0, 115, 92);
		panel_2.add(picRock);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(184, 134, 11));
		panel_3.setBounds(10, 283, 151, 95);
		grbPlayer.add(panel_3);
		
		JRadioButton radUserScrissors = new JRadioButton("");
		radUserScrissors.setSelected(true);
		radUserScrissors.setBackground(new Color(184, 134, 11));
		radUserScrissors.setBounds(6, 27, 21, 23);
		panel_3.add(radUserScrissors);
		
		JLabel picScissors = new JLabel("");
		picScissors.setIcon(new ImageIcon("N:\\a\\Sem2-Winter2019\\ICS4U Programming\\Veverita, Valeria (s449619)\\Unit 1(part2)\\Rock, paper, scissors\\Images\\scissors2.png"));
		picScissors.setBounds(36, 0, 115, 92);
		panel_3.add(picScissors);
		
		JPanel grbComp = new JPanel();
		grbComp.setLayout(null);
		grbComp.setBackground(new Color(184, 134, 11));
		grbComp.setBounds(281, 34, 185, 390);
		frame.getContentPane().add(grbComp);
		
		JLabel lblComputersChoice = new JLabel("Computer's Choice");
		lblComputersChoice.setForeground(Color.WHITE);
		lblComputersChoice.setFont(new Font("Kozuka Gothic Pr6N B", Font.BOLD, 16));
		lblComputersChoice.setBounds(10, 27, 164, 22);
		grbComp.add(lblComputersChoice);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(184, 134, 11));
		panel_5.setBounds(10, 177, 151, 95);
		grbComp.add(panel_5);
		
		JRadioButton radCompPaper = new JRadioButton("");
		radCompPaper.setEnabled(false);
		radCompPaper.setBackground(new Color(184, 134, 11));
		radCompPaper.setBounds(6, 27, 21, 23);
		panel_5.add(radCompPaper);
		
		JLabel picPaper = new JLabel("");
		picPaper.setEnabled(false);
		picPaper.setBounds(33, 0, 115, 92);
		panel_5.add(picPaper);
		picPaper.setIcon(new ImageIcon("N:\\a\\Sem2-Winter2019\\ICS4U Programming\\Veverita, Valeria (s449619)\\Unit 1(part2)\\Rock, paper, scissors\\Images\\paper2.png"));
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(184, 134, 11));
		panel_6.setBounds(10, 71, 151, 95);
		grbComp.add(panel_6);
		
		JRadioButton radCompRock = new JRadioButton("");
		radCompRock.setEnabled(false);
		radCompRock.setBackground(new Color(184, 134, 11));
		radCompRock.setBounds(6, 27, 21, 23);
		panel_6.add(radCompRock);
		
		JLabel picRockC = new JLabel("");
		picRockC.setEnabled(false);
		picRockC.setIcon(new ImageIcon("N:\\a\\Sem2-Winter2019\\ICS4U Programming\\Veverita, Valeria (s449619)\\Unit 1(part2)\\Rock, paper, scissors\\Images\\rock2.png"));
		picRockC.setBounds(36, 0, 115, 92);
		panel_6.add(picRockC);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(184, 134, 11));
		panel_7.setBounds(10, 283, 151, 95);
		grbComp.add(panel_7);
		
		JRadioButton radCompScissors = new JRadioButton("");
		radCompScissors.setEnabled(false);
		radCompScissors.setBackground(new Color(184, 134, 11));
		radCompScissors.setBounds(6, 27, 21, 23);
		panel_7.add(radCompScissors);
		
		JLabel picScissorsC = new JLabel("");
		picScissorsC.setEnabled(false);
		picScissorsC.setIcon(new ImageIcon("N:\\a\\Sem2-Winter2019\\ICS4U Programming\\Veverita, Valeria (s449619)\\Unit 1(part2)\\Rock, paper, scissors\\Images\\scissors2.png"));
		picScissorsC.setBounds(36, 0, 115, 92);
		panel_7.add(picScissorsC);
		grbComp.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblComputersChoice, panel_5, radCompPaper, picPaper, panel_6, radCompRock, picRockC, panel_7, radCompScissors, picScissorsC}));
		
		//////////////////////////////////////////////////////////////
		//group the radio buttons
		ButtonGroup user_rad = new ButtonGroup();
		user_rad.add(radUserRock);
		user_rad.add(radUserPaper);
		user_rad.add(radUserScrissors);
		
		ButtonGroup comp_rad = new ButtonGroup();
		comp_rad.add(radCompRock);
		comp_rad.add(radCompPaper);
		comp_rad.add(radCompScissors);
		
		JButton btnNewButton = new JButton("PLAY");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//check if rock radio button was checked
				if (radUserRock.isSelected())
				{
					//set the user choice to be equal to rock
					userChoice = ROCK;
				}
				else if (radUserPaper.isSelected())
				{
					//set the user choice to be equal to paper
					userChoice = PAPER;
				}
				else if (radUserScrissors.isSelected())
				{
					//set the user choice to be equal to scissors
					userChoice = SCISSORS;
				}
				
				//select a random number between 1 and 3
				int rnd_num = (int)(Math.random()*((max-min)+1))+min;
				//check the radio button for the computer choice and set its choice
				if(rnd_num == 1)
				{
					//set the computer choice to be equal to rock
					compChoice = ROCK;
					radCompRock.setSelected(true);
				}
				else if(rnd_num == 2)
				{
					//set the computer choice to be equal to paper
					compChoice = PAPER;
					radCompPaper.setSelected(true);
				}
				else if(rnd_num == 3)
				{
					//set the computer choice to be equal to scissors
					compChoice = SCISSORS;
					radCompScissors.setSelected(true);
				}
				
				//import the images
				ImageIcon tie = new ImageIcon ("tie.png"); 
				ImageIcon win = new ImageIcon ("win.png"); 
				ImageIcon lose = new ImageIcon ("lose.png"); 
				//compare the answers
				if (userChoice == ROCK)
				{
					if (compChoice == ROCK)
					{
						//create the JOptionPane (message Box)
						JOptionPane.showMessageDialog(null,"It's a tie!","Result",JOptionPane.WARNING_MESSAGE, tie);
					}
					else if (compChoice == PAPER)
					{
						//create the JOptionPane (message Box)
						JOptionPane.showMessageDialog(null,"You lost!","Result",JOptionPane.WARNING_MESSAGE, lose);
					}
					else if (compChoice == SCISSORS)
					{
						//create the JOptionPane (message Box)
						JOptionPane.showMessageDialog(null,"You won!","Result",JOptionPane.WARNING_MESSAGE, win);
					}
				}
				else if (userChoice == PAPER)
				{
					if (compChoice == ROCK)
					{
						//create the JOptionPane (message Box)
						JOptionPane.showMessageDialog(null,"You won!","Result",JOptionPane.WARNING_MESSAGE, win);
					}
					else if (compChoice == PAPER)
					{
						//create the JOptionPane (message Box)
						JOptionPane.showMessageDialog(null,"It's a tie!","Result",JOptionPane.WARNING_MESSAGE, tie);
					}
					else if (compChoice == SCISSORS)
					{
						//create the JOptionPane (message Box)
						JOptionPane.showMessageDialog(null,"You lost!","Result",JOptionPane.WARNING_MESSAGE, lose);
					}
				}
				else if (userChoice == SCISSORS)
				{
					if (compChoice == ROCK)
					{
						//create the JOptionPane (message Box)
						JOptionPane.showMessageDialog(null,"You lost!","Result",JOptionPane.WARNING_MESSAGE, lose);
					}
					else if (compChoice == PAPER)
					{
						//create the JOptionPane (message Box)
						JOptionPane.showMessageDialog(null,"You won!","Result",JOptionPane.WARNING_MESSAGE, win);
					}
					else if (compChoice == SCISSORS)
					{
						//create the JOptionPane (message Box)
						JOptionPane.showMessageDialog(null,"It's a tie!","Result",JOptionPane.WARNING_MESSAGE, tie);
					}
				}
				
			}
		});
		btnNewButton.setBounds(199, 436, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
