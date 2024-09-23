package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{
    JButton submit, reset, close;
    JTextField tfusername;
    JPasswordField tfpassword;
    
    
    public Login() {

        setLayout(null);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/loginimg.png"));
        JLabel image = new JLabel(i1);
         image.setForeground(Color.RED);
        image.setBounds(0, 0, 600, 450);
        add(image);
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(650, 20, 100, 20);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(730, 20, 200, 20);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(650, 60, 100, 20);
        add(lblpassword);
        
        tfpassword = new JPasswordField();
        tfpassword.setBounds(730, 60, 200, 20);
        add(tfpassword);
        
        reset = new JButton("Reset");
        reset.setBounds(650, 120, 120, 20);
        reset.addActionListener(this);
        add(reset);
        
        submit = new JButton("Submit");
        submit.setBounds(850, 120, 120, 20);
        submit.addActionListener(this);
        add(submit);
        
        close = new JButton("Close");
        close.setBounds(750, 160, 120, 20);
        close.addActionListener(this);
        add(close);
        
         setSize(1000, 450);
        setLocation(200, 100);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()  == submit) {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            try {
                Conn c = new Conn();
                
                String query = ("select * from login where username = '"+username+"' and password = '"+password+"'");
                
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, " Successfully login");
                    new Home();
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                    setVisible(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == close) {
            setVisible(false);
        } else if (ae.getSource() == reset) {
            tfusername.setText("");
            tfpassword.setText("");
        }
    }
    
    
    public static void main(String[] args) {
        new Login();
    }
}