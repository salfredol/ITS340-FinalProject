package its340.finalproject;
import java.sql.*;

public class DBUtils_Demog 
{
    public static ResultSet GetAllPatients(Connection conn)
    {
        ResultSet rs = null;
        try
        {
            String qryStoredProc = "{CALL GetAllPatients}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            rs = cs.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
        return rs;
    }
    public static int InsertPatient(Connection conn, 
            String fName, String lName, String homePhone, String ssn)
    {
        int insertStatus = 0;
        try
        {
            String qryStoredProc = "{CALL InsertPatient(?, ?, ?, ?)}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            cs.setString(1, fName);
            cs.setString(2, lName);
            cs.setString(3, homePhone);
            cs.setString(4, ssn);
            
            insertStatus = cs.executeUpdate();
            return insertStatus;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
        return insertStatus;
    }
    public static void UpdatePatient(Connection conn, int pid, 
            String fName, String lName, String prevLast, String mobPhone, String homePhone, 
            String emPhone, String email, String hcp, String ssn, String dob, 
            String gender, String marital, String address, String city, String state, 
            String zip, String country, String citizenship, String ethnicity, String nextOfKin, 
            String nokRelation, String comments)
    {
        try
        {
            String qryStoredProc = "{CALL UpdatePatient(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);

            cs.setInt(1, pid);
            cs.setString(2, fName);
            cs.setString(3, lName);
            cs.setString(4, prevLast);
            cs.setString(5, mobPhone);
            cs.setString(6, homePhone);
            cs.setString(7, emPhone);
            cs.setString(8, email);
            cs.setString(9, hcp);
            cs.setString(10, ssn); 
            cs.setString(11, dob);
            cs.setString(12, gender);
            cs.setString(13, marital);
            cs.setString(14, address);
            cs.setString(15, city);
            cs.setString(16, state);
            cs.setString(17, zip);
            cs.setString(18, country);
            cs.setString(19, citizenship);
            cs.setString(20, ethnicity);
            cs.setString(21, nextOfKin);
            cs.setString(22, nokRelation);
            cs.setString(23, comments);

            cs.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static ResultSet GetPatient_LastName(Connection conn, String lname)
    {
        ResultSet rs = null;
        try
        {
            String qryStoredProc = "{CALL GetPatient_LastName(?)}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            cs.setString(1, lname);
            rs = cs.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
        return rs;
    }
    public static ResultSet GetPatient_FromID(Connection conn, int pid)
    {
        ResultSet rs = null;
        try
        {
            String qryStoredProc = "{CALL GetPatient_FromID(?)}";
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
    public static void DeletePatient(Connection conn, int pid)
    {
        try
        {
            String qryStoredProc = "{CALL DeletePatient(?)}";
            CallableStatement cs = conn.prepareCall(qryStoredProc);
            cs.setInt(1, pid);
            cs.executeUpdate();
            //maybe add integer return to confirm successful deletion
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() );
        }
    }
}
