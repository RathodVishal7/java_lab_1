import java.sql.*;
public class pro5
{
	public static void main(String[] args) 
	{
        Connection conn;
 	    String url = "jdbc:mysql://localhost:3306/employee";
    try 
	{
            conn = DriverManager.getConnection(url,"root","tnrao");

            // Execute a query
            System.out.println("Creating PreparerdStatement...");
            String sql = "delete from emp where firstname = ?";
            PreparedStatement pt = conn.prepareStatement(sql);

            pt.setString(1,"Chintan");

            int val = pt.executeUpdate();
            System.out.println(val + "record delete Sucessfully...");
           
            pt.close();
            conn.close();
        }  
	catch (Exception e) 
	{
            
            e.printStackTrace();
        }   
	}
}