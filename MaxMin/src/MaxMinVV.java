import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class MaxMinVV {

	private JFrame frame;

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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 243, 231);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnGenerate = new JButton("Generate  \r\n");
		btnGenerate.setForeground(new Color(255, 255, 255));
		btnGenerate.setBackground(new Color(184, 134, 11));
		btnGenerate.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnGenerate.setBounds(10, 11, 134, 73);
		frame.getContentPane().add(btnGenerate);
		
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
		
		JTextPane txtRandoms = new JTextPane();
		txtRandoms.setForeground(new Color(184, 134, 11));
		txtRandoms.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtRandoms.setText("1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n10");
		txtRandoms.setBackground(new Color(255, 250, 205));
		txtRandoms.setBounds(179, 0, 54, 192);
		frame.getContentPane().add(txtRandoms);
	}
}
