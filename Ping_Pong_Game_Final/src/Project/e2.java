package Project;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.*;

class e2a extends JFrame
{
    JTextField user;
    JTextField password;

        Connection con = null;
        public  int roll_no,stuid;
        public String name;
        public e2a() throws IOException {
            con = (Connection) e1.dbconnect();
            setTitle("Student Login");
            setLocation(380,120);
            setLayout(null);
            setResizable(false);
       

            Font fo = new Font("Times New Roman",Font.BOLD,30);
            Font fo1 = new Font("Times New Roman",Font.PLAIN,18);


            ImageIcon i1 = new ImageIcon("Images/logo.png");
            setIconImage(i1.getImage());

            JLabel stu = new JLabel("Student Login ");
            stu.setBounds(300, 1, 200, 100);
            stu.setForeground(Color.CYAN);
            stu.setFont(fo);
            add(stu);

            JLabel stu_img = new JLabel();
            stu_img.setIcon(new ImageIcon("D:\\Desktop\\Quiz_Management_System\\Images\\Student.png"));
            stu_img.setBounds(355, 90, 200, 100);
            add(stu_img);


            JLabel j1 = new JLabel("User Name :");
            j1.setBounds(300, 200, 100, 40);
            j1.setForeground(Color.WHITE);
            j1.setFont(fo1);
            add(j1);

            JLabel j2 = new JLabel("Password :");
            j2.setBounds(300, 300, 100, 40);
            j2.setForeground(Color.WHITE);
            j2.setFont(fo1);
            add(j2);

            user = new JTextField();
            user.setBounds(400,200,120,40);
            add(user);

            password = new JPasswordField();
            password.setBounds(400,300,120,40);
            add(password);


            JButton b1 = new JButton("Login");
            b1.setFont(fo1);
            b1.setBounds(300,380,100,40);
            add(b1);

            JButton b2 = new JButton("Back");
            b2.setFont(fo1);
            b2.setBounds(420,380,100,40);
            add(b2);


            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   try {
                       String usr= user.getText();
                       String pwd=String.valueOf(password.getText());
                       PreparedStatement pst= (PreparedStatement)con.prepareStatement("select * from reg where username =? and password=?");
                       pst.setString(1,usr);
                       pst.setString(2,pwd);
                       ResultSet r = pst.executeQuery();
                       if(r.next())
                       {
     
                           JOptionPane.showMessageDialog(null,"Login Successfull ");
                           dispose();
                           e2a i1 = new e2a();
                           i1.setSize(1000, 600);
                       }
                       else
                       {
                           JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                       }
                   }catch (Exception e1)
                   {
                       e1.printStackTrace();
                   }
                }
            });
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }


    }

public class e2
{
    public static void main(String args[]) throws IOException {

        e2a s = new e2a();
        s.setSize(800,600);
    }
}