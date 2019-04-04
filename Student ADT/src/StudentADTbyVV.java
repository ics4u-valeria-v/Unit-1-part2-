import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class StudentADTbyVV {

	private JFrame frmStudent;
	private JTextField txtLast;
	private JTextField txtFirst;
	private JTextField tctcMiddle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentADTbyVV window = new StudentADTbyVV();
					window.frmStudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentADTbyVV() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudent = new JFrame();
		frmStudent.setTitle("Student Info");
		frmStudent.setBounds(100, 100, 259, 331);
		frmStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudent.getContentPane().setLayout(null);
		
		JLabel lblLast = new JLabel("Last Name:");
		lblLast.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLast.setBounds(10, 11, 86, 35);
		frmStudent.getContentPane().add(lblLast);
		
		JLabel lblFirst = new JLabel("First Name:");
		lblFirst.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFirst.setBounds(10, 57, 98, 35);
		frmStudent.getContentPane().add(lblFirst);
		
		txtLast = new JTextField();
		txtLast.setBounds(134, 20, 86, 20);
		frmStudent.getContentPane().add(txtLast);
		txtLast.setColumns(10);
		
		txtFirst = new JTextField();
		txtFirst.setColumns(10);
		txtFirst.setBounds(134, 66, 86, 20);
		frmStudent.getContentPane().add(txtFirst);
		
		JLabel lblMiddle = new JLabel("Middle Initial:");
		lblMiddle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMiddle.setBounds(10, 106, 110, 35);
		frmStudent.getContentPane().add(lblMiddle);
		
		tctcMiddle = new JTextField();
		tctcMiddle.setColumns(10);
		tctcMiddle.setBounds(134, 115, 86, 20);
		frmStudent.getContentPane().add(tctcMiddle);
		
		JComboBox comboBoxGrade = new JComboBox();
		comboBoxGrade.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBoxGrade.setMaximumRowCount(12);
		comboBoxGrade.setBounds(134, 159, 85, 25);
		frmStudent.getContentPane().add(comboBoxGrade);
		
		JLabel lblGrade = new JLabel("Grade :");
		lblGrade.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGrade.setBounds(10, 152, 110, 35);
		frmStudent.getContentPane().add(lblGrade);
		
		JLabel lblIdentify = new JLabel("Identify: ");
		lblIdentify.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdentify.setBounds(10, 198, 110, 35);
		frmStudent.getContentPane().add(lblIdentify);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(134, 207, 26, 23);
		frmStudent.getContentPane().add(checkBox);
		
		JButton btnEnter = new JButton("ENTER");
		
		//when enter button is pressed get the information that was entered
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//define an object that will represent the member class
				Member studInfo = new Member();
			   
				//get the last name and assign it to studInfo.lastName
				studInfo.lastName = txtLast.getText();
				
				//get the first name and assign it to studInfo.firstName
				studInfo.firstName = txtFirst.getText();
				
				//get the middle liter and assign it to studInfo.middleName
				try
				{
					studInfo.middleName = (tctcMiddle.getText()).charAt(0);
				}
				catch(Exception e1) {
					  //  Block if its not a character
					JOptionPane.showMessageDialog(null, "Please enter only the initial");	
				}
				
				//get the grade and assign it to studInfo.grade
				studInfo.grade = comboBoxGrade.getSelectedIndex()+1;
				
				//check if they identified or not
				
				if (checkBox.isSelected())
				{
					studInfo.identify = "identified";
				}
				else
				{
					studInfo.identify = "not identified";
				}
				
				//call the display message box function
				studInfo.DisplayInfo();
			}
		});
		btnEnter.setBounds(10, 258, 89, 23);
		frmStudent.getContentPane().add(btnEnter);
	}
	
	//create a class and populate it with variables
	class Member
	{
		public String lastName;
		public String firstName;
		public char middleName;
		public int grade;
		public String identify;
		
		public void DisplayInfo()
		{
			JOptionPane.showMessageDialog(null, lastName + " "+ middleName + " "+ firstName + " is in grade " + grade + " and is " + identify);	
		}
	};
}
