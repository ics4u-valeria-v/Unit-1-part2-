/*
 * MaxMin Program
 * Created: by Valeria V
 * Created on: March-4-2019
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MaxMinVV {

	private JFrame frame;

	//declare global variables
	int min_Num = 99;
	int max_Num = 1;
	int []randomNumbers = new int[10];
	
	JTextPane txtRandoms;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaxMinVV window = new MaxMinVV();
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
	public MaxMinVV() {
		initialize();
	}
	
	//Function: FindMax
	//Input: randomNumbers[]
	//Output: maxNum 
	// This function loops through the array with random numbers and gets the max number
	public int FindMax(int[]randomNum)
	{
		int maxNum = 0;
		//generate random numbers by using the for loop
		for (int counter = 0; counter < 10; counter++)
		{
			int rndNum = randomNum[counter];

			//check if the number if greater than the maxNum
		    if (rndNum > maxNum)
			{
				//then set the maximum number to be equal to the random number
				maxNum = rndNum;
			}
			
		}
		
		return maxNum;
	}
	
	//Function: FindMin
	//Input: randomNumbers[]
	//Output: maxNum 
	// This function loops through the array with random numbers and gets the max number
	public int FindMin(int[]randomNum)
	{
		int minNum = 99;
		//generate random numbers by using the for loop
		for (int counter = 0; counter < 10; counter++)
		{
			int rndNum = randomNum[counter];

			//check if the number if less than the minNum
			if (rndNum < minNum)
			{
				//then set the minimum number to be equal to the random number
				minNum = rndNum;
			}
			
		}
		
		return minNum;
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 243, 231);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMax = new JLabel("Max:");
		lblMax.setForeground(new Color(184, 134, 11));
		lblMax.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblMax.setBounds(10, 95, 134, 22);
		frame.getContentPane().add(lblMax);
		
		JLabel lblMin = new JLabel("Min:");
		lblMin.setForeground(new Color(184, 134, 11));
		lblMin.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblMin.setBounds(10, 128, 134, 22);
		frame.getContentPane().add(lblMin);
		
		
		JButton btnGenerate = new JButton("Generate  \r\n");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//declare local variables
				String displayStr = "";
				int max = 99;
				int min = 1;
				
				//generate random numbers by using the for loop
				for (int counter = 0; counter < 10; counter++)
				{
					//select a random number between 1 and 99
					int rnd_num = (int)(Math.random()*((max-min)+1))+min;
					//add the number to the array
					randomNumbers[counter] = rnd_num;
					//convert the integer to a string
					String numStr = Integer.toString(rnd_num);
					//add the number to the list box
					displayStr = displayStr + "\n" +  numStr;
					
				}
				//add the display string to the text box
				txtRandoms.setText(displayStr);
				//call FindMin and FindMax function
				min_Num = FindMin(randomNumbers);
				max_Num = FindMax(randomNumbers);
				//display the min and max 
				lblMin.setText("Min: " + min_Num);
				lblMax.setText("Max: " + max_Num);
				
				
			}
		});
		btnGenerate.setForeground(new Color(255, 255, 255));
		btnGenerate.setBackground(new Color(184, 134, 11));
		btnGenerate.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnGenerate.setBounds(10, 11, 134, 73);
		frame.getContentPane().add(btnGenerate);
		
		
		txtRandoms = new JTextPane();
		txtRandoms.setForeground(new Color(184, 134, 11));
		txtRandoms.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtRandoms.setBackground(new Color(255, 250, 205));
		txtRandoms.setBounds(179, 0, 54, 192);
		frame.getContentPane().add(txtRandoms);
	}
}
