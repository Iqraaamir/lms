package l_m_s;

import java.sql.*;

public class conn {

    Connection c;
    Statement s;
    ResultSet rs;

    //Constructor Of Database !!
    public conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "");
            s = c.createStatement();
            System.out.println("DATABASE CONNECTED !!");

        } catch (ClassNotFoundException | SQLException a) {
            System.out.println("NOT CONNECTED !!" + a);
        }

    }

    //Login_user Database !!
    public ResultSet Login(String user, String pass) {

        try {
            String sql = "select * from account where username='" + user + "' and password='" + pass + "'";
            rs = s.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Error sql !!" + e);
        }
        return rs;
    }
}
