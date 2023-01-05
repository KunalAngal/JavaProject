package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_page2 extends JFrame {

	 JPanel contentPane;
	 JTextField textField;
	 JTextField textField_1;
	 JPasswordField  textField_2;
	 JPasswordField  textField_3;
	 JTextField textField_4;
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_page2 frame = new Login_page2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login_page2() {
		setBackground(new Color(153, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1014, 615);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Player 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(184, 78, 160, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Player 2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(726, 80, 186, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(75, 201, 131, 34);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();					//Player 2 Username
		textField.setBounds(774, 206, 170, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Username :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(635, 203, 111, 37);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();					//Player 1 Username
		textField_1.setBounds(236, 206, 167, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
//		passwordField = new JPasswordField();
//        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
//        passwordField.setBounds(481, 286, 281, 68);
//        contentPane.add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("Password :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(75, 308, 117, 34);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Password :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(635, 310, 111, 30);
		contentPane.add(lblNewLabel_5);
		
		textField_2 = new JPasswordField();							//Player 1 Password
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_2.setBounds(777, 308, 167, 34);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JPasswordField ();								//Player 2 Password
		textField_3.setBounds(236, 311, 167, 38);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Score To Win");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_6.setBounds(443, 386, 160, 26);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setBounds(463, 423, 97, 34);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(454, 512, 128, 37);
		contentPane.add(btnNewButton);
	}

}
