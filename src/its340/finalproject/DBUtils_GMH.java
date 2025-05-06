package its340.finalproject;
import java.sql.*;

public class DBUtils_GMH 
{
    public static ResultSet GetGMHRecordsFromPID(Connection conn, int pid)
    {
        ResultSet rs = null;
        try
        {
            String qryStoredProc = "{CALL GetGMHRecordsFromPID(?)}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            cs.setInt(1, pid);
            rs = cs.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
        return rs;
    }
}
