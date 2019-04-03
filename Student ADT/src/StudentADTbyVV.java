import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEnter.setBounds(10, 258, 89, 23);
		frmStudent.getContentPane().add(btnEnter);
	}
}
