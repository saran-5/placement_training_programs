import java.sql.*;

public class connectioncheck {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "2004";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Connected Successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}