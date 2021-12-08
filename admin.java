package l_m_s;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class admin extends JFrame implements ActionListener{
    
    JButton b1,b2,b4;
    
    public admin(){
    
       //Frame
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        //JPanel One
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(0, 0, 0,200));
        p1.setLayout(null);
        p1.setBounds(0, 0, 250, 800);
        add(p1);
        
          //Logo Use Password
        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("l_m_s/Icon/admin.gif"));
        Image ic2 = ic1.getImage().getScaledInstance(250, 530, Image.SCALE_DEFAULT);
        ImageIcon image4 = new ImageIcon(ic2);
        JLabel lab3 = new JLabel(image4);
        lab3.setBounds(0, 0, 250, 530);
        p1. add(lab3);

        //Panel  Two
        JPanel p2 = new JPanel();
        p2.setBackground(new Color(0,0,0, 200));
        p2.setBounds(250, 0, 700, 800);
        p2.setLayout(null);
         add(p2);

        
        //Logo Use Password
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("l_m_s/Icon/wood.jpg"));
        Image ic3 = icon2.getImage().getScaledInstance(700, 550, Image.SCALE_DEFAULT);
        ImageIcon image5 = new ImageIcon(ic3);
        JLabel lab4 = new JLabel(image5);
       lab4.setBounds(0,0, 700, 550);
        p2.add(lab4);

           //Panel  Two
        JPanel p3 = new JPanel();
        p3.setBackground(new Color(0,0,0, 200));
        p3.setBounds(50, 30, 600, 470);
        p3.setLayout(null);
         lab4.add(p3);
         
           //Button to ADMIN
        b1 = new JButton("ADD LIBRARIAN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(160, 60, 300, 60);
        Font f3 = new Font("Times new Roman", Font.BOLD, 30);
        b1.setFont(f3);
        p3.add(b1);
        b1.addActionListener(this);
        
           //Button to ADMIN
        b2 = new JButton("VIEW LIBRARIAN");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(160, 200, 300, 60);
        Font f4 = new Font("Times new Roman", Font.BOLD, 30);
        b2.setFont(f4);
        p3.add(b2);
        b2.addActionListener(this);
        
       /*    //Button to ADMIN
        JButton b3 = new JButton("DELETE LIBRARIAN");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(160, 240, 300, 60);
        Font f5 = new Font("Times new Roman", Font.BOLD, 30);
        b3.setFont(f5);
        p3.add(b3);*/
        
           //Button to ADMIN
        b4 = new JButton("LOGOUT");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(160, 330, 300, 60);
        Font f6 = new Font("Times new Roman", Font.BOLD, 30);
        b4.setFont(f6);
        p3.add(b4);
        b4.addActionListener(this);
        
        
        
      //frame size and location 
        setBounds(220, 80, 945, 560);

    
    
    }
     public void actionPerformed(ActionEvent ae) {
     
     if(ae.getSource() == b1){
         new Signup ().setVisible(true);
     
     }
     if(ae.getSource() == b2){
         new Viewlibrarian ().setVisible(true);
     
     }
       if(ae.getSource() == b4){
          setVisible(false);
           Login_user login=new Login_user();
          login.setVisible(true);
           
       }
     
     }
     
    
    public static void main(String[] args) {
        admin a=new admin();
    }
}
