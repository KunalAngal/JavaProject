package Project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class Login_page1 extends JFrame
{
	 JPanel contentPane;
	 
     JTextField textField;
	 JTextField textField_1;
	 JTextField textField_2;
	 JTextField textField_3;
	 JTextField textField_4;

		Connection con = null;
	public Login_page1() {
	
		con = (Connection) e1.dbconnect();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1014, 615);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To \r\nPong Game");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 40));
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(287, 118, 544, 100);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Login");
		
		btnNewButton.setBackground(new Color(255, 0, 102));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBackground(Color.RED);
		btnNewButton.setBounds(287, 282, 110, 47);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) 
			{
				try {
				new Register ();
			       } catch(StackOverflowError e1)
			         {
				       e1.printStackTrace();
			         }
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(255, 0, 102));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(595, 282, 137, 47);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("More");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(255, 51, 102));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(447, 366, 110, 47);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(54, 32, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				new Login_page2();
			
			}
		});
	}
	public static void main(String[] args) {
		
		Login_page1 frame = new Login_page1();
					frame.setVisible(true);
		
	}	
}