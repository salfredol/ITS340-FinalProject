package its340.finalproject;
import java.sql.*;

public class GlobalData 
{
    public static int patientID;
    public static String patientName;
    
    public static Decision AnimalTreeQSet;
    
    public static Connection ConnectToDB(String username, String password)
    {
        String dbURL = "jdbc:mysql://localhost:3306/gmh_interview"
                + "?autoreconnect=true&useSSL=false";
        
        Connection conn = null;
        try 
        {
            //register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, username, password);
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
        return conn;
    }
}
