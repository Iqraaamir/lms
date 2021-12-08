package l_m_s;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Signup extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton b1, b2;
    private JComboBox comboBox;

    public static void main(String[] args) {
        new Signup().setVisible(true);
    }

    public Signup() {
        setBounds(382, 160, 650, 450);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.setLayout(null);
         setUndecorated(true); 
         
        Font f1 = new Font("Times New Roman", Font.BOLD, 18);
        Font f2 = new Font("Bradley Hand ITC", Font.BOLD, 18);
         Font f3 = new Font("Times New Roman", Font.BOLD, 15);

        JLabel lblUsername = new JLabel("Username :");
        lblUsername.setForeground(Color.DARK_GRAY);
        lblUsername.setBounds(99, 86, 92, 26);
        lblUsername.setFont(f1);
        contentPane.add(lblUsername);

        JLabel lblName = new JLabel("Name :");
        lblName.setForeground(Color.DARK_GRAY);
        lblName.setFont(f1);
        lblName.setBounds(99, 123, 92, 26);
        contentPane.add(lblName);

        JLabel lblPassword = new JLabel("Password :");
        lblPassword.setForeground(Color.DARK_GRAY);
        lblPassword.setFont(f1);
        lblPassword.setBounds(99, 160, 92, 26);
        contentPane.add(lblPassword);

        JLabel lblAnswer = new JLabel("Answer :");
        lblAnswer.setForeground(Color.DARK_GRAY);
        lblAnswer.setFont(f1);
        lblAnswer.setBounds(99, 234, 92, 26);
        contentPane.add(lblAnswer);

        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"Your NickName?", "Your Lucky Number?",
            "Your child SuperHero?", "Your childhood Name ?"}));
        comboBox.setBounds(285, 202, 148, 20);
        comboBox.setFont(f3);
        contentPane.add(comboBox);

        JLabel lblSecurityQuestion = new JLabel("Security Question :");
        lblSecurityQuestion.setForeground(Color.DARK_GRAY);
        lblSecurityQuestion.setFont(f1);
        lblSecurityQuestion.setBounds(99, 197, 155, 26);
        contentPane.add(lblSecurityQuestion);

        textField = new JTextField();
        textField.setBounds(265, 91, 148, 20);
           textField.setFont(f1);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(265, 128, 148, 20);
          textField_1.setFont(f1);
        contentPane.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(265, 165, 148, 20);
          textField_2.setFont(f1);
        contentPane.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(265, 239, 148, 20);
          textField_3.setFont(f1);
        contentPane.add(textField_3);

        b1 = new JButton("CREATE");
        b1.addActionListener(this);
         b1.setFont(f2);
        b1.setBounds(130, 289, 120, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        b2 = new JButton("BACK");
        b2.addActionListener(this);
          b2.setFont(f2);
        b2.setBounds(300, 289, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);

        JPanel panel = new JPanel();
        panel.setForeground(new Color(210,105,30));
        panel.setBorder(new TitledBorder(new LineBorder(new Color(139, 69, 19), 2), "CREATE-ACCOUNT",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(178, 34, 34)));
        panel.setBounds(50, 50,550, 350);
        panel.setBackground(Color.LIGHT_GRAY);
        contentPane.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
          try{
            conn con = new conn();
            
            if(ae.getSource() == b1){
                String sql = "insert into account(username, name, password, sec_q, sec_ans) values(?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, textField.getText());
                                st.setString(2, textField_1.getText());
		st.setString(3, textField_2.getText());
		st.setString(4, (String) comboBox.getSelectedItem());
		st.setString(5, textField_3.getText());

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "SuccesFully Created !!");
                }

                textField.setText("");
                textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		//new Login_user().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
     
    }
}