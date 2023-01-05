package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
public class Register
{
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField textname,textfull,textaddress,textemail,textcontact;
	JPasswordField text1pass,text2pass,text3pass;
	JButton b1;
	Connection con=null;
	Statement stmt;
	JTextField textField;
	ResultSet rs;
	public Register()
	{
		f=new JFrame();
		f.getContentPane().setBackground(new Color(240, 255, 255));
		f.setSize(700,700);
		f.getContentPane().setLayout(null);
		
		JLabel l1= new JLabel ("Registration Page");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		l1.setBounds(268,22,255,40);
		f.getContentPane().add(l1);
		
		JLabel l2= new JLabel ("Enter username :");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l2.setBounds(100,120,120,40);
		f.getContentPane().add(l2);
		
		textname=new JTextField();
		textname.setBounds(268,123,255,40);
		f.getContentPane().add(textname);
		
		JLabel l3= new JLabel ("Enter Password :");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l3.setBounds(100,180,120,40);
		f.getContentPane().add(l3);
		
		text1pass=new JPasswordField();
		text1pass.setBounds(268,183,255,40);
		f.getContentPane().add(text1pass);
		
		JLabel l4= new JLabel ("Enter FullName :");
		l4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l4.setBounds(100,243,120,40);
		f.getContentPane().add(l4);
		
		textfull=new JTextField();
		textfull.setBounds(268,243,255,40);
		f.getContentPane().add(textfull);
		
		JLabel l5= new JLabel ("Enter Address :");
		l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l5.setBounds(100,300,120,40);
		f.getContentPane().add(l5);
		
		textaddress=new JTextField();
		textaddress.setBounds(268,303,255,40);
		f.getContentPane().add(textaddress);
		
		JLabel l6= new JLabel ("Enter Email :");
		l6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l6.setBounds(100,360,120,40);
		f.getContentPane().add(l6);
		
		textemail=new JTextField();
		textemail.setBounds(268,363,255,40);
		f.getContentPane().add(textemail);
		
		JLabel l7= new JLabel ("Enter ContactNo :");
		l7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l7.setBounds(100,420,120,40);
		f.getContentPane().add(l7);
		
		textcontact=new JTextField();
		textcontact.setBounds(268,423,255,40);
		f.getContentPane().add(textcontact);
		

		JLabel l8= new JLabel ("Confirm Password :");
		l8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l8.setBounds(100,480,158,40);
		f.getContentPane().add(l8);
		
		text2pass=new JPasswordField();
		text2pass.setBounds(268,483,255,40);
		f.getContentPane().add(text2pass);
	     
	     JButton b1= new JButton ("Submit");
	     b1.setBounds(289,613,100,40);
	     f.getContentPane().add(b1);
	     
	     JLabel lblNewLabel = new JLabel("Admin Password :");
	     lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
	     lblNewLabel.setBounds(100, 549, 140, 29);
	     f.getContentPane().add(lblNewLabel);
	     		
	        text3pass= new JPasswordField();
	        text3pass.setBounds(268, 546, 255, 40);
			f.getContentPane().add(text3pass);
			text3pass.setColumns(10);
	    
	     b1.addActionListener(new ActionListener() 
	     {
	    	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
			//new Login_page1();
			//f.dispose();
				
				Connection con;
				PreparedStatement pstatement;
				String name = textname.getText();
				String pass = text1pass.getText().toString();
				String fullname = textfull.getText();
				String address = textaddress.getText();
				String email = textemail.getText();
				String contact = textcontact.getText();
				String confirmpass = text2pass.getText().toString();
				String adminpass = text3pass.getText().toString();
				
				
				
				try {
			   		 Class.forName("com.mysql.cj.jdbc.Driver");
			   		 con = DriverManager.getConnection("jdbc:mysql://localhost:3307/register","root","");
			   		
			   		 String q = "insert into reg(Username, Password, name, address, email, contact, confirm_password, admin_password)values(?,?,?,?,?,?,?,?)";
		             pstatement = con.prepareStatement(q);
		          
		             pstatement.setString(1, textname.getText());
		             pstatement.setString(2, text1pass.getText().toString());
		             pstatement.setString(3, textfull.getText());
		             pstatement.setString(4,  textaddress.getText());
		             pstatement.setString(5, textemail.getText());
		             pstatement.setString(6, textcontact.getText());
		             pstatement.setString(7, text2pass.getText().toString());
		             pstatement.setString(8, text3pass.getText().toString());
		             pstatement.executeUpdate();
			   		 JOptionPane.showMessageDialog(f, "register successfully");
			        }catch(SQLException e2) {
			        	e2.printStackTrace();
			        	System.out.print("Database is not connected");
			        }catch(Exception e1) {
			        	System.out.print("Exception occured");
			        	e1.printStackTrace();
			        }
				
			}
	     });
    
    
   f.setVisible(true);
	     }
	    	 
};