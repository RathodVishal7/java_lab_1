import java.sql.*;
public class pro2 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        String url = "jdbc:mysql://localhost:3306/employee";
        try {
                // Register JDBC driver
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                conn = DriverManager.getConnection(url, "root", "tnrao");
                // Execute a query
                System.out.println("Creating statement...");
                stmt =conn.createStatement();
                String sql = "SELECT FROM emp";
                ResultSet rs = stmt.executeQuery(sql);
                // Extract data from result set
                while (rs.next()){
                    String fnm =rs.getString(2);
                    String lnm =rs.getString(3);
                    String des =rs.getString(4);
                    // Display values
                    System.out.println(" fName:" + fnm);
                    System.out.println(" LName:" + lnm);
                    System.out.println(" Desig:" + des);
                }
                rs.close();
                stmt.close();
                conn.close();
} catch (Exception e) {
                e.printStackTrace();
}
}
}