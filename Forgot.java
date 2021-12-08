package l_m_s;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;

public class Forgot extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField t1, t2, t3, t4, t5;
    private JButton b1, b2, b3;

    public static void main(String[] args) {
        new Forgot().setVisible(true);
    }

    public Forgot() {

        setBounds(380, 180, 660, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.setLayout(null);
        setUndecorated(true); 
        
        Font f1 = new Font("Times New Roman", Font.BOLD, 18);
        Font f2 = new Font("Bradley Hand ITC", Font.BOLD, 18);
         

        JLabel l1 = new JLabel("Username");
        l1.setBounds(109, 83, 87, 29);
        l1.setFont(f1);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Name");
        l2.setBounds(109, 122, 75, 21);
        l2.setFont(f1);
        contentPane.add(l2);

        JLabel l3 = new JLabel("Your Security Question");
        l3.setBounds(109, 154, 185, 27);
        l3.setFont(f1);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Answer");
        l4.setBounds(109, 192, 104, 21);
        l4.setFont(f1);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Password");
        l5.setBounds(109, 224, 104, 21);
        l5.setFont(f1);
        contentPane.add(l5);

        t1 = new JTextField();
        t1.setForeground(new Color(105, 105, 105));
        t1.setBounds(277, 88, 139, 20);
         t1.setFont(f1);
        contentPane.add(t1);
        t1.setColumns(10);

        t2 = new JTextField();
        t2.setEditable(false);
        t2.setForeground(new Color(165, 42, 42));
        t2.setColumns(10);
        t2.setBounds(277, 123, 139, 20);
         t2.setFont(f1);
        contentPane.add(t2);

        t3 = new JTextField();
        t3.setEditable(false);
        t3.setFont(new Font("Tahoma", Font.BOLD, 12));
        t3.setForeground(new Color(72, 61, 139));
        t3.setColumns(10);
        t3.setBounds(300, 161, 221, 20);
         t3.setFont(f1);
        contentPane.add(t3);

        t4 = new JTextField();
        t4.setFont(new Font("Tahoma", Font.BOLD, 13));
        t4.setForeground(new Color(205, 92, 92));
        t4.setColumns(10);
        t4.setBounds(277, 193, 139, 20);
         t4.setFont(f1);
        contentPane.add(t4);

        t5 = new JTextField();
        t5.setEditable(false);
        t5.setForeground(new Color(50, 205, 50));
        t5.setColumns(10);
        t5.setBounds(277, 225, 139, 20);
         t5.setFont(f1);
        contentPane.add(t5);

        b1 = new JButton("SEARCH");
        b1.addActionListener(this);
        b1.setBounds(428, 83, 115, 28);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(f2);
        contentPane.add(b1);

        b2 = new JButton("RETRIEVE");
        b2.addActionListener(this);
        b2.setBounds(426, 188, 128, 28);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
          b2.setFont(f2);
        contentPane.add(b2);

        b3 = new JButton("BACK");
        b3.addActionListener(this);
        b3.setBounds(233, 270, 100, 29);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
          b3.setFont(f2);
        contentPane.add(b3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(139, 69, 19), 2), "FORGOT-PASSWORD",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(178, 34, 34)));
        panel.setBounds(55, 45, 508, 281);
      
        panel.setBackground(Color.LIGHT_GRAY);
        contentPane.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
          try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "select * from account where username=?";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, t1.getText());
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("sec_q"));
		}

            }
            if(ae.getSource() == b2){
                String sql = "select * from account where sec_ans=?";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, t4.getText());
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
                    	t5.setText(rs.getString("password"));
		}

            }
            if(ae.getSource() == b3){
                this.setVisible(false);
		new Login_user().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
      

    }

}
