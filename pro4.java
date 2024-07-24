import java.sql.*;
public class pro4
{
	public static void main(String[] args) 
	{
        Connection conn;
 	    String url = "jdbc:mysql://localhost:3306/employee";
    try 
	{
            conn = DriverManager.getConnection(url,"root","tnrao");

            // Execute a query
            String sql = "update emp set firstname = ? where lastname = ?";
            PreparedStatement pt = conn.prepareStatement(sql);

            pt.setString(1,"Chintan");
            pt.setString(2,"Patel");

            int val = pt.executeUpdate();
            if(val > 0 )
            {
                System.out.println("Updateted....");
            }
           
            pt.close();
            conn.close();
        }  
	catch (Exception e) 
	{
            
            e.printStackTrace();
        }   
	}
}