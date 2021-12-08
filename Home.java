package l_m_s;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {

    private JButton b1, b2, b3, b4, b5, b6;

    public Home() {

        //Frame
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Font f1 = new Font("Times new Roman", Font.BOLD, 20);
        
        
         JMenuBar menuBar = new JMenuBar();
            menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
            menuBar.setBackground(Color.BLACK);
            menuBar.setBounds(0, 0, 970, 35);
            add(menuBar);

            JMenu mnExit = new JMenu("Exit");
            mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            mnExit.setForeground(Color.WHITE);
            
            
            JMenuItem mntmLogout = new JMenuItem("Logout");
            mntmLogout.setBackground(Color.WHITE);
            mntmLogout.setForeground(new Color(105, 105, 105));
            mntmLogout.addActionListener(this);
            mnExit.add(mntmLogout);
            
            JMenuItem mntmExit = new JMenuItem("Exit");
            mntmExit.setForeground(Color.BLACK);
           mntmExit.setBackground(Color.WHITE);
            mntmExit.addActionListener(this);
            mnExit.add(mntmExit);
                
            

            JMenu mnHelp = new JMenu("Help");
            mnHelp.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            mnHelp.setForeground(Color.WHITE);
            

            JMenuItem mntmReadme = new JMenuItem("Read Me");
            mntmReadme.setBackground(Color.WHITE);
            mntmReadme.setForeground(new Color(105, 105, 105));
            mnHelp.add(mntmReadme);

            JMenuItem mntmAboutUs = new JMenuItem("About Us");
            mntmAboutUs.setForeground(new Color(105, 105, 105));
            mntmAboutUs.setBackground(Color.WHITE);
            mntmAboutUs.addActionListener(this);
            mnHelp.add(mntmAboutUs);

            JMenu mnRecord = new JMenu("Record");
            mnRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            mnRecord.setForeground(Color.WHITE);
            

            JMenuItem bookdetails = new JMenuItem("Book Details");
            bookdetails.addActionListener(this);
            bookdetails.setBackground(Color.WHITE);
            bookdetails.setForeground(Color.DARK_GRAY);
            mnRecord.add(bookdetails);

            JMenuItem studentdetails = new JMenuItem("Student Details");
            studentdetails.setBackground(Color.WHITE);
            studentdetails.setForeground(Color.DARK_GRAY);
            studentdetails.addActionListener(this);
            mnRecord.add(studentdetails);
            
            menuBar.add(mnRecord);
            menuBar.add(mnHelp);
            menuBar.add(mnExit);


        ///Image 
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("l_m_s/Icon/home3.jpg"));
        Image i1 = icon.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
        ImageIcon im1 = new ImageIcon(i1);
        JLabel l1 = new JLabel(im1);
        l1.setBounds(0, 0, 1360, 700);
        add(l1);

        ///Image 
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("l_m_s/Icon/7.gif"));
        Image i2 = icon1.getImage().getScaledInstance(220, 200, Image.SCALE_DEFAULT);
        ImageIcon image1 = new ImageIcon(i2);
        JLabel label = new JLabel(image1);
        label.setBounds(970, 0, 220, 200);
        l1.add(label);

        //JPanel One
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(0, 0, 0, 200));
        p1.setLayout(null);
        p1.setBounds(0, 0, 270, 800);
        l1.add(p1);
        
           JLabel l3 = new JLabel("Dashboard");
            l3.setForeground(new Color(240,248,255));
            l3.setFont(new Font("Old English Text MT", Font.BOLD , 45));
            l3.setBounds(30, 40, 250, 55);
            p1.add(l3);

        b1 = new JButton("ADD BOOKS");
        //     b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(30, 160, 200, 44);
        b1.setFont(f1);
        p1.add(b1);

        b2 = new JButton("STATICS");
        // b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(30, 220, 200, 44);
        b2.setFont(f1);
        p1.add(b2);

        b3 = new JButton("ADD STUDENTS");
        //  b3.addActionListener(this);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(30, 280, 200, 44);
        b3.setFont(f1);
        p1.add(b3);

        b4 = new JButton("ISSUE BOOK");
        //   b4.addActionListener(this);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(30, 340, 200, 41);
        b4.setFont(f1);
        p1.add(b4);

        b5 = new JButton("RETURN BOOK");
        //    b5.addActionListener(this);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(30, 400, 200, 41);
        b5.setFont(f1);
        p1.add(b5);

        b6 = new JButton("ABOUT US");
        //   b6.addActionListener(this);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(30, 460, 200, 41);
        b6.setFont(f1);
        p1.add(b6);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        //frame size and location 
        setBounds(80, 40, 1200, 670);

    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("Logout")) {
          
            new Login_user().setVisible(true);
        } else if (msg.equals("Exit")) {
            System.exit(ABORT);

        } else if (msg.equals("Read Me")) {

        } else if (msg.equals("About Us")) {
            setVisible(false);
            new aboutUs().setVisible(true);

        } else if (msg.equals("Book Details")) {
            setVisible(false);
            new BookDetails().setVisible(true);
        } else if (msg.equals("Student Details")) {
            setVisible(false);
            new StudentDetails().setVisible(true);

        }

        if (ae.getSource() == b1) {
          
            new AddBook().setVisible(true);
        }
        if (ae.getSource() == b2) {
          
            new Statistics().setVisible(true);
        }
        if (ae.getSource() == b3) {
           
            new AddStudent().setVisible(true);
        }
        if (ae.getSource() == b4) {
          
            new IssueBook().setVisible(true);
        }
        if (ae.getSource() == b5) {
            
            new ReturnBook().setVisible(true);

        }
        if (ae.getSource() == b6) {
          
            new aboutUs().setVisible(true);

        }

    }

    public static void main(String[] args) {
        new Home().setVisible(true);
    }

}
