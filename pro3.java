import java.sql.*;
public class pro3
{
	public static void main(String[] args) 
	{
        Connection conn;
        Statement stmt;
 	    String url = "jdbc:mysql://localhost:3306/employee";
    try 
	{
            conn = DriverManager.getConnection(url,"root","tnrao");

            // Execute a query
            stmt = conn.createStatement();
            String sql = "select * from emp where empno > 2";
            ResultSet rs =  stmt.executeQuery(sql);

            while(rs.next())
            {
                String fnm = rs.getString(2);
                String lnm = rs.getString(3);
                String des = rs.getString(4);

                System.out.println("Fname : " + fnm);
                System.out.println("Lname : " + lnm);
                System.out.println("Desig : " + des);
            }
           
            rs.close();
            stmt.close();
            conn.close();
        }  
	catch (Exception e) 
	{
            
            e.printStackTrace();
        }   
	}
}