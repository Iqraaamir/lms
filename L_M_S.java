package l_m_s;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class L_M_S extends JFrame implements ActionListener {

    JLabel l2, id;
    JButton b, b1;

    public L_M_S() {

        //Frame  
        setTitle("FRONT");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        ///Image 
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("l_m_s/Icon/B.jpg"));
        Image i1 = icon.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
        ImageIcon im1 = new ImageIcon(i1);
        JLabel l1 = new JLabel(im1);
        l1.setBounds(0, 100, 1360, 530);
        add(l1);

        //JPanel One
        JPanel p2 = new JPanel();
        p2.setBackground(new Color(0, 0, 0, 200));
        p2.setLayout(null);
        p2.setBounds(0, 0, 1400, 120);
        add(p2);

        //Label of Library Management System !
        JLabel lid = new JLabel("LIBRARY MANAGEMENT SYSTEM");
        lid.setBounds(20, 5, 1500, 100);
        lid.setFont(new Font("Times New Roman", Font.PLAIN, 70));
        lid.setForeground(Color.WHITE);
        p2.add(lid);

        //GIF With Text
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("l_m_s/Icon/e.gif"));
        Image i2 = icon1.getImage().getScaledInstance(250, 175, Image.SCALE_DEFAULT);
        ImageIcon im2 = new ImageIcon(i2);
        l2 = new JLabel(im2);
        l2.setBounds(1110, 1, 250, 100);
        p2.add(l2);   //Label of Book GIF

        //JPanel One
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(0, 0, 0, 200));
        p1.setLayout(null);
        p1.setBounds(380, 360, 550, 120);
        l1.add(p1);

        //Button to Contine
        b = new JButton("ADMIN");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(40, 25, 200, 60);
        Font f2 = new Font("Times new Roman", Font.BOLD, 35);
        b.setFont(f2);
        p1.add(b);
        b.addActionListener(this);

        //Button to ADMIN
        b1 = new JButton("LIBRARIAN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(290, 25, 240, 60);
        Font f3 = new Font("Times new Roman", Font.BOLD, 35);
        b1.setFont(f3);
        b1.addActionListener(this);
        p1.add(b1);

        //Frame set size and location !
        setBounds(5, 20, 1360, 670);
        getContentPane().setBackground(Color.DARK_GRAY);

        //Blinking the label of library managment system !!
        while (true) {
            p2.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception a) {
            }
            p2.setVisible(true);
            try {
                Thread.sleep(750);
            } catch (Exception a) {
            }
        }

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            dispose();
            new admin().setVisible(true);
        }
        if (ae.getSource() == b1) {
            dispose();
            new Login_user().setVisible(true);
        }
    }

    public static void main(String[] args) {
        L_M_S window = new L_M_S();
        window.setVisible(true);
    }
}
