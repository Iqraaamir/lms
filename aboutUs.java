package l_m_s;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us ");
         
            setBackground(new Color(173, 216, 230));         
            setBounds(370, 130, 700, 500); 
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

         


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 0,0));
            l3.setFont(new Font("Old English Text MT", Font.BOLD | Font.ITALIC, 40));
            l3.setBounds(270, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Management System");
            l4.setForeground(new Color(0, 0, 0));
            l4.setFont(new Font("Old English Text MT", Font.BOLD | Font.ITALIC, 40));
            l4.setBounds(160, 90, 505, 40);
            contentPane.add(l4);

          

            JLabel l10 = new JLabel("**************THE END*************");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(190, 400, 600, 34);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.WHITE);
	}
        

}
