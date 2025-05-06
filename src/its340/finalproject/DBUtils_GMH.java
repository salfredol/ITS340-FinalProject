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
    public static ResultSet GetGMHRecord_FromGMHID(Connection conn, int gmhid)
    {
        ResultSet rs = null;
        try
        {
            String qryStoredProc = "{CALL GetGMHRecord_FromGMHID(?)}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            cs.setInt(1, gmhid);
            rs = cs.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
        return rs;
    }
    public static int InsertGMHRecord(Connection conn, int pid,
            String tob, String alc, String drg, String bldtyp, String rhesus)
    {
        int insertStatus = 0;
        try
        {
            String qryStoredProc = "{CALL InsertGMHRecord(?, ?, ?, ?, ?, ?)}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            cs.setInt(1, pid);
            cs.setString(2, tob);
            cs.setString(3, alc);
            cs.setString(4, drg);
            cs.setString(5, bldtyp);
            cs.setString(6, rhesus);
            
            insertStatus = cs.executeUpdate();
            return insertStatus;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
        return insertStatus;
    }
    public static void UpdateGMHRecord(Connection conn, int gmhid, 
            String tob, String tobquant, String tobdur, String alc, String alcquant, 
            String alcdur, String drg, String drgtype, String drgdur, String bldtyp, 
            String rhesus)
    {
        try
        {
            String qryStoredProc = "{CALL UpdateGMHRecord(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            cs.setInt(1, gmhid);
            cs.setString(2, tob);
            cs.setString(3, tobquant);
            cs.setString(4, tobdur);
            cs.setString(5, alc);
            cs.setString(6, alcquant);
            cs.setString(7, alcdur);
            cs.setString(8, drg);
            cs.setString(9, drgtype);
            cs.setString(10, drgdur);
            cs.setString(11, bldtyp);
            cs.setString(12, rhesus);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
    }
    public static void DeleteGMHRecord(Connection conn, int gmhid)
    {
        try
        {
            String qryStoredProc = "{CALL DeleteGMHRecord(?)}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            cs.setInt(1, gmhid);
            cs.executeUpdate();
            //maybe add integer return to confirm successful deletion
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
    }
}
