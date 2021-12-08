package l_m_s;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login_user extends JFrame implements ActionListener {

    JTextField t1;
    JPasswordField t2;
    JButton b1, b2, b3, b4;
    //JLabel lab15;
    //JLabel lab16;

    public Login_user() {

        //Frame
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Font 
        Font f = new Font("Bradley Hand ITC", Font.BOLD, 15);
        Font f1 = new Font("Bradley Hand ITC", Font.BOLD, 25);
         Font f2 = new Font("Times New Roman", Font.PLAIN, 25);
        

        //JPanel One
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(0, 0, 0));
        p1.setLayout(null);
        p1.setBounds(150, 80, 300, 390);
        
           //Logo Use Password
        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("l_m_s/Icon/lb.gif"));
        Image ic2 = ic1.getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT);
        ImageIcon image4 = new ImageIcon(ic2);
        JLabel lab3 = new JLabel(image4);
        lab3.setBounds(0, 0, 300, 400);
        p1.add(lab3);

        //Panel  Two
        JPanel p2 = new JPanel();
        p2.setBackground(new Color(169, 169, 169, 160));
        p2.setBounds(420, 80, 390, 390);
        p2.setLayout(null);

        //Logo Use Login
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("l_m_s/Icon/log.png"));
        Image i2 = i.getImage().getScaledInstance(150, 70, Image.SCALE_DEFAULT);
        ImageIcon im2 = new ImageIcon(i2);
        JLabel l5 = new JLabel(im2);
        l5.setBounds(175, 2, 150, 70);
        p2.add(l5);

        //Logo Use Username
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("l_m_s/Icon/us.png"));   // l_m_s/Icon/e.gif
        Image i4 = i3.getImage().getScaledInstance(80, 70, Image.SCALE_DEFAULT);
        ImageIcon im3 = new ImageIcon(i4);
        JLabel l2 = new JLabel(im3);
        l2.setBounds(30, 80, 100, 75);
        p2.add(l2);

        //Label of Username
        JLabel lab4 = new JLabel("USERNAME");
        lab4.setFont(f);
        lab4.setForeground(Color.BLACK);
        lab4.setBounds(140, 75, 200, 25);
        p2.add(lab4);

        //JTextField of name
        t1 = new JTextField();
        t1.setFont(f2);
        t1.setBounds(140, 95, 210, 38);
        p2.add(t1);

        //Logo Use Password
        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("l_m_s/Icon/pf.png"));
        Image i6 = i5.getImage().getScaledInstance(80, 70, Image.SCALE_DEFAULT);
        ImageIcon im4 = new ImageIcon(i6);
        JLabel l3 = new JLabel(im4);
        l3.setBounds(30, 170, 100, 75);
        p2.add(l3);

        //Label of Password
        JLabel lab2 = new JLabel("PASSWORD");
        lab2.setFont(f);
        lab2.setForeground(Color.BLACK);
        lab2.setBounds(140, 165, 200, 25);
        p2.add(lab2);
        
        //Label of message2
       // lab16 = new JLabel(" ");
        //lab15.setFont(f);
        //lab15.setForeground(Color.RED);
        //lab15.setBounds(140,135,200,25);
        //p2.add(lab16);

        //JPasswordField of password
        t2 = new JPasswordField();
        t2.setFont(f2);
        t2.setBounds(140, 187, 210, 38);
        p2.add(t2);

        //JButton of Login 
        b1 = new JButton("Login");
        b1.setFont(f1);
        b1.setBounds(60, 280, 130, 40);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        p2.add(b1);

        //JButton of SignUp
        b2 = new JButton("SignUp");
        b2.setFont(f1);
        b2.setBounds(230, 280, 130, 40);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        p2.add(b2);

        //JButton of Forgot
        b3 = new JButton("Forgot");
        b3.setFont(f1);
        b3.setBounds(60, 340, 130, 40);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        p2.add(b3);

        //JButton of Back
        b4 = new JButton("Cancel");
        b4.setFont(f1);
        b4.setBounds(230, 340, 130, 40);
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        p2.add(b4);

        //Image Of Background
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("l_m_s/Icon/f.jpg"));
        Image i1 = icon.getImage().getScaledInstance(955, 600, Image.SCALE_DEFAULT);
        ImageIcon im1 = new ImageIcon(i1);
        JLabel l1 = new JLabel(im1);
        l1.setBounds(0, 0, 950, 530);
        add(l1);
        l1.add(p2);
        l1.add(p1);

        //frame size and location 
        setBounds(220, 80, 945, 560);

        // Button Add with action listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    }

    /**
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
       // if(t1.getText().trim().isEmpty()&&t2.getText().trim().isEmpty()){
         //   t1.setText(null);
           // lab16.setText("Enter User-name");
            
            //t2.setText("a");
            //lab15.setText("Enter Password");
        //}
        //else if(t1.getText().trim().isEmpty()){
          //  lab15.setText("");
            
        //}
        //else if(t2.getText().trim().isEmpty()){
          //  lab16.setText("");
            
        //}
        
        if (ae.getSource() == b1) {
            try {
                conn con = new conn();
                ResultSet rs = con.Login(t1.getText(), t2.getText());

                if (rs.next()) {
                    setVisible(false);
                    new Loading().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Login !!");
                    t1.setText("");
                    t2.setText("");
                }

            } catch (Exception e2) {
                System.out.println(" error in sql !!" + e2);
                e2.printStackTrace();
            }
        }
        if (ae.getSource() == b2) {
           
            Signup su = new Signup();
            su.setVisible(true);
        }
        if (ae.getSource() == b3) {
    
            Forgot forgot = new Forgot();
            forgot.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login_user().setVisible(true);
    }

}
