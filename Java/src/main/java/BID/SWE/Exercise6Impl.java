package BID.SWE;

import java.sql.*;

public class Exercise6Impl implements Exercise6 {
    @Override
    public Object Method1() {
        Connection _connection = null;
        PreparedStatement prep = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            _connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swe","root","");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        try {
            Statement stmt = _connection.createStatement();
            prep = _connection.prepareStatement("INSERT INTO TestAbgaben ('Id', 'Tag', 'Monat', 'Jahr', 'Stunde', 'Minute', 'Name') VALUES (?, ?, ?, ?, ?, ?, ?)");
            prep.setInt(1, 1);
            prep.setInt(2, 12);
            prep.setInt(3, 12);
            prep.setInt(4, 2019);
            prep.setInt(5, 17);
            prep.setInt(6, 15);
            prep.setString(7, "Mein Name");
        } catch(Exception e) {
            System.out.println(e);
        }

        return prep;
    }
}
