
package l_m_s;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;
 
public class Viewlibrarian extends JFrame implements ActionListener {
    
     private final JPanel contentPane;
    private JTable table;
    private JTextField search;
    private JButton b1, b2;

       public void student() {
           try {
            conn con = new conn();
            String sql = "select * from account";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
        } catch (Exception e) {

        }
    }

    public Viewlibrarian() {
      
        setBounds(260, 130, 890, 475);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(79, 133, 771, 288);
        contentPane.add(scrollPane);

        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int row = table.getSelectedRow();
                search.setText(table.getModel().getValueAt(row, 1).toString());
            }
        });
        table.setBackground(new Color(176,196,222));
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        scrollPane.setViewportView(table);

        JButton b1 = new JButton("Search");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(new Color(0,0,0), 2, true));
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("l_m_s/Icon/eight.png"));
        Image i2 = i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        b1.setIcon(i3);
        b1.setForeground(new Color(199, 21, 133));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        b1.setBounds(564, 89, 138, 33);
        contentPane.add(b1);

      /*  JButton b2 = new JButton("Delete");
        b2.addActionListener(this);
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("l_m_s/Icon/nineth.png"));
        Image i5 = i4.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        b2.setIcon(i6);
        b2.setForeground(new Color(199, 21, 133));
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        b2.setBorder(new LineBorder(new Color(255, 20, 147), 2, true));
        b2.setBounds(712, 89, 138, 33);
        contentPane.add(b2);*/

        JLabel l1 = new JLabel("VIEW LIBRARIAN");
        l1.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 40));
        l1.setBounds(200, 20, 400, 47);
        contentPane.add(l1);

        search = new JTextField();
     //   search.setBackground(new Color(0,0,0));
        search.setBorder(new LineBorder(new Color(0,0,0), 2, true));
        search.setForeground(new Color(47, 79, 79));
        search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        search.setBounds(189, 89, 357, 33);
        contentPane.add(search);
        search.setColumns(10);

        JLabel l2 = new JLabel("Back");
        l2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                admin ad = new admin();
                ad.setVisible(true);
            }
        });
        l2.setForeground(Color.GRAY);
        l2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("l_m_s/Icon/tenth.png"));
        Image i8 = i7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l2.setIcon(i9);
        l2.setBounds(97, 89, 72, 33);
        contentPane.add(l2);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0,0,0), 3, true), "VIEW-LIBRARIAN",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,0,0)));
        panel.setBounds(68, 59, 790, 370);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);

        student();
          setVisible(true);
    }
 public void actionPerformed(ActionEvent ae) {
     
 }
   
    
    public static void main(String[] args) {
        
        Viewlibrarian lib=new Viewlibrarian();
        
    }
    
}
