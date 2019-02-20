/*
 * Created by: Valeria Veverita
 * Created on: February-20-2018
 * This program generates a random number and checks if the user number is equal to the rndNumber
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import "Random" library
import java.util.Random;
import javax.swing.SwingConstants;

public class DiceGame {
	
	//declare global variables
			int compNum;
			int wrongCounter = 0;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiceGame window = new DiceGame();
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
	public DiceGame() {

		initialize();
		//generate a random number
		Random rndNum = new Random();
		//obtain a random number between 1 and 6
		compNum = rndNum.nextInt(6) + 1;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 371, 274);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInstr = new JLabel("Guess the number:");
		lblInstr.setForeground(new Color(165, 42, 42));
		lblInstr.setFont(new Font("Myriad Pro", Font.BOLD, 20));
		lblInstr.setBounds(62, 29, 179, 33);
		frame.getContentPane().add(lblInstr);
		
		JLabel lblNumGuess = new JLabel("Number of guesses before correct:");
		lblNumGuess.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumGuess.setForeground(new Color(153, 102, 0));
		lblNumGuess.setFont(new Font("Myriad Pro", Font.BOLD, 18));
		lblNumGuess.setBounds(10, 164, 335, 33);
		frame.getContentPane().add(lblNumGuess);
		//hide the label
		lblNumGuess.setVisible(false);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer.setForeground(new Color(153, 102, 0));
		lblAnswer.setFont(new Font("Myriad Pro", Font.BOLD, 18));
		lblAnswer.setBounds(10, 120, 335, 33);
		frame.getContentPane().add(lblAnswer);
		//hide the label
		lblAnswer.setVisible(false);
		
		JSpinner spnNumbers = new JSpinner();
		spnNumbers.setToolTipText("");
		spnNumbers.setForeground(new Color(153, 0, 0));
		spnNumbers.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		spnNumbers.setModel(new SpinnerNumberModel(1, 1, 6, 1));
		spnNumbers.setBounds(251, 29, 47, 33);
		frame.getContentPane().add(spnNumbers);
		
		JButton btnGuess = new JButton("GUESS");
		btnGuess.addActionListener(new ActionListener() {
			
			//Button function
			public void actionPerformed(ActionEvent arg0) {
				
				//get the number from the user
				int userVal = (Integer) spnNumbers.getValue();
				
				//check if the user's answer is equal to compNum
				if (userVal == compNum)
				{
					//set the labels to be visible
					lblAnswer.setVisible(true);
					lblNumGuess.setVisible(true);
					//display what is the random number
					lblAnswer.setText("The random number: " + compNum);
					//display how many times did it take the user to guess the number
					lblNumGuess.setText("Number of guesses before correct: " + wrongCounter);
				}
				else
				{
					//increment the wrongCounter
					wrongCounter++;
					//set the label to be visible
					lblAnswer.setVisible(true);
					//say the user to try again
					lblAnswer.setText("Try again");
				}
				
				
				
			}
		});
		btnGuess.setForeground(new Color(255, 255, 255));
		btnGuess.setBackground(new Color(102, 0, 0));
		btnGuess.setBounds(136, 73, 89, 23);
		frame.getContentPane().add(btnGuess);
		
		
	}
}
