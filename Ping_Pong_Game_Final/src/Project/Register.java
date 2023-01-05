package Project;
import java.sql.Connection;
import java.sql.DriverManager;
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
	JTextField t1,t3,t4,t5,t6;
	JPasswordField t2,t7,t8;
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
		
		t1=new JTextField();
		t1.setBounds(268,123,255,40);
		f.getContentPane().add(t1);
		
		JLabel l3= new JLabel ("Enter Password :");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l3.setBounds(100,180,120,40);
		f.getContentPane().add(l3);
		
		t2=new JPasswordField();
		t2.setBounds(268,183,255,40);
		f.getContentPane().add(t2);
		
		JLabel l4= new JLabel ("Enter FullName :");
		l4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l4.setBounds(100,243,120,40);
		f.getContentPane().add(l4);
		
		t3=new JTextField();
		t3.setBounds(268,243,255,40);
		f.getContentPane().add(t3);
		
		JLabel l5= new JLabel ("Enter Address :");
		l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l5.setBounds(100,300,120,40);
		f.getContentPane().add(l5);
		
		t4=new JTextField();
		t4.setBounds(268,303,255,40);
		f.getContentPane().add(t4);
		
		JLabel l6= new JLabel ("Enter Email :");
		l6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l6.setBounds(100,360,120,40);
		f.getContentPane().add(l6);
		
		t5=new JTextField();
		t5.setBounds(268,363,255,40);
		f.getContentPane().add(t5);
		
		JLabel l7= new JLabel ("Enter ContactNo :");
		l7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l7.setBounds(100,420,120,40);
		f.getContentPane().add(l7);
		
		t6=new JTextField();
		t6.setBounds(268,423,255,40);
		f.getContentPane().add(t6);
		

		JLabel l8= new JLabel ("Confirm Password :");
		l8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l8.setBounds(100,480,158,40);
		f.getContentPane().add(l8);
		
		t7=new JPasswordField();
		t7.setBounds(268,483,255,40);
		f.getContentPane().add(t7);
	     
	     JButton b1= new JButton ("Submit");
	     b1.setBounds(289,613,100,40);
	     f.getContentPane().add(b1);
	     
	     JLabel lblNewLabel = new JLabel("Admin Password :");
	     lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
	     lblNewLabel.setBounds(100, 549, 140, 29);
	     f.getContentPane().add(lblNewLabel);
	     		
			t8 = new JPasswordField();
			t8.setBounds(268, 546, 255, 40);
			f.getContentPane().add(t8);
			t8.setColumns(10);
	    
	     b1.addActionListener(new ActionListener() 
	     {
	    	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
			new Login_page1();
			f.dispose();
		String username=t1.getText().toString();
   		 char p[]=t2.getPassword();
   		 String password=new String(p);
   		 String name=t3.getText().toString();
   		 String address=t4.getText().toString();
   		 String email=t5.getText().toString();
   		 String contact=t6.getText().toString();
   		char q[]=t7.getPassword();
  		 String confirm_password=new String(q);
  		char r[]=t8.getPassword();
  		 String admin_password=new String(r);

          try {
   		 Class.forName("com.mysql.jdbc.Driver");
   		 con=DriverManager.getConnection("jdbc:mysql://localhost:3307/register","root","");
   		 stmt=con.createStatement();
   		 stmt.executeUpdate("insert into reg values ('"+ username +"','"+ password +"','"+ name +"','"+ address +"','"+ email +"','"+ contact +"','"
   		 + confirm_password+"','"+admin_password+"')");
   		 JOptionPane.showMessageDialog(f, "regeister successfully");
   		 new Login_page1();
   		 f.dispose();

//   		 while(rs.next())
//   		 {
//   			 if(admin_password.equals(rs.getString(8)))
//   					 {
//   				             
//   					 }
//   		 }
          }catch(ClassNotFoundException e1)
          {
       	   e1.printStackTrace();
          }
          catch(SQLException e1)
          {
       	   e1.printStackTrace();
          }finally
          {  
       	   try {
				con.close();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
          }
			}
	     });
    
    
   f.setVisible(true);
	     }
	    	 
};