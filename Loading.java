package l_m_s;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable {

	private JPanel contentPane;
	private JProgressBar progressBar;
	Connection conn;
	int s;
	Thread th;

	public static void main(String[] args) {
            new Loading().setVisible(true);
	}

	public void setUploading() {
            setVisible(false);
            th.start();
	}

	public void run() {
            try {
                for (int i = 0; i < 200; i++) {
                    s = s + 1;
                    int m = progressBar.getMaximum();
                    int v = progressBar.getValue();
                    if (v < m) {
                        progressBar.setValue(progressBar.getValue() + 1);
                    } else {
                        i = 201;
                        setVisible(false);
                       new Home().setVisible(true);
                    }
                    Thread.sleep(65);
                }
            } catch (Exception e) {
		e.printStackTrace();
            }
	}

	public Loading() {
           
            super("Loading");
            th = new Thread((Runnable) this);

            setBounds(400, 150, 600, 400);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);
            
             //Image Of Background
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("l_m_s/Icon/load.gif"));
        Image i1 = icon.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon im1 = new ImageIcon(i1);
        JLabel l1 = new JLabel(im1);
        l1.setBounds(0, 0, 600, 600);
        add(l1);

            JLabel lbllibraryManagement = new JLabel("JUW Library !!");
            lbllibraryManagement.setForeground(new Color(0,0,0));
            lbllibraryManagement.setFont(new Font("Times new Roman", Font.BOLD, 55));
            lbllibraryManagement.setBounds(80, 40, 500, 55);
            contentPane.add(lbllibraryManagement);
	
            progressBar = new JProgressBar();
            progressBar.setFont(new Font("Old English Text MT", Font.BOLD, 12));
            progressBar.setStringPainted(true);
            progressBar.setBackground(Color.DARK_GRAY);
            progressBar.setBounds(120, 135, 360, 30);
            contentPane.add(progressBar);

            JLabel lblNewLabel_2 = new JLabel("Please Wait....!!");
            lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
            lblNewLabel_2.setForeground(new Color(0,0,0));
            lblNewLabel_2.setBounds(210, 170, 250, 35);
            contentPane.add(lblNewLabel_2);

            JPanel panel = new JPanel();
            panel.setBackground(new Color (28,99,115));
            panel.setBounds(0, 0, 590, 390);
            contentPane.add(panel);
            
            setUndecorated(true);    
            setUploading();
	}
}
