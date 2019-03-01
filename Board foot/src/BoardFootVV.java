/*
 * BoardFoot
 * Created by: Valeria V
 * Created on: March-01-2019
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BoardFootVV {

	private JFrame frmBoardFoot;
	private JTextField txtFirst;
	private JTextField txtSecond;
	
	//declare global variables
	String first;
	String second;
	double firstVal;
	double secondVal;
	double thirdVal;
	double area = 144;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardFootVV window = new BoardFootVV();
					window.frmBoardFoot.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BoardFootVV() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBoardFoot = new JFrame();
		frmBoardFoot.setTitle("Board foot");
		frmBoardFoot.setBounds(100, 100, 490, 181);
		frmBoardFoot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBoardFoot.getContentPane().setLayout(null);
		
		JLabel lblFirstVal = new JLabel("First value:");
		lblFirstVal.setForeground(new Color(184, 134, 11));
		lblFirstVal.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblFirstVal.setBounds(21, 24, 95, 21);
		frmBoardFoot.getContentPane().add(lblFirstVal);
		
		JLabel lblSecVal = new JLabel("Second value:");
		lblSecVal.setForeground(new Color(184, 134, 11));
		lblSecVal.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblSecVal.setBounds(258, 24, 118, 21);
		frmBoardFoot.getContentPane().add(lblSecVal);
		
		txtFirst = new JTextField();
		txtFirst.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirst.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtFirst.setBounds(116, 26, 86, 20);
		frmBoardFoot.getContentPane().add(txtFirst);
		txtFirst.setColumns(10);
		
		txtSecond = new JTextField();
		txtSecond.setHorizontalAlignment(SwingConstants.CENTER);
		txtSecond.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtSecond.setColumns(10);
		txtSecond.setBounds(371, 24, 86, 20);
		frmBoardFoot.getContentPane().add(txtSecond);
		
		JLabel lblAnswer = new JLabel("*");
		//Hide the answer label
		lblAnswer.setVisible(false);
		lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer.setForeground(new Color(184, 134, 11));
		lblAnswer.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblAnswer.setBounds(21, 109, 436, 21);
		frmBoardFoot.getContentPane().add(lblAnswer);
		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				///get the values from the first text boxes
				first = txtFirst.getText();
				second = txtSecond.getText();
				
				//check if the values are valid
				try
				{
					firstVal = Double.parseDouble(first);
					secondVal = Double.parseDouble(second);
					
					//check if the values are equal to 12
					if(firstVal == 12 && secondVal == 12)
					{
						//calculate the third value
						thirdVal = area / (firstVal * secondVal);
						//Show the answer label
						lblAnswer.setVisible(true);
						lblAnswer.setText("The third dimension: " + thirdVal + " inches^3");
					}
					else
					{
						//Warn the user that have entered invalids values
						lblAnswer.setVisible(true);
						lblAnswer.setText("Ensure both fields have correct input");
						txtFirst.setText("INVALID");
						txtSecond.setText("INVALID");
					}

				}
				catch(NumberFormatException e1)
				{
					//Warn the user that have entered invalids values
					lblAnswer.setVisible(true);
					lblAnswer.setText("Ensure both fields have correct input");
					txtFirst.setText("INVALID");
					txtSecond.setText("INVALID");
				}
			}
		});
		btnCalculate.setForeground(new Color(255, 255, 255));
		btnCalculate.setBackground(new Color(184, 134, 11));
		btnCalculate.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnCalculate.setBounds(174, 75, 118, 23);
		frmBoardFoot.getContentPane().add(btnCalculate);
		
		
	}
}
