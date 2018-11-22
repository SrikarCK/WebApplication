package Datalayer;

import javax.print.DocFlavor;
import java.sql.*;

import static java.lang.Class.forName;

public class DB_user {

    //JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/webapptutorial";

    //Database Credentials
    static final String USER = "webappuser";
    static final String PASS = "qwerty";

    public boolean isValidUserlogin(String sUserName,String sUserPassword)
    {
        boolean isValidUser = false;

        Connection conn = null;
        Statement stmt = null;
        String sql = "";

        //try and catch
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to Database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating Statement....");
            stmt = conn.createStatement();

            sql = "SELECT * FROM users WHERE user_name = \"" + sUserName + "\" AND user_password = \"" + sUserPassword + "\"";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            if (rs.next()){
                isValidUser = true;
            }

            //Step 6: Clean-Up environment
            rs.close();
            stmt.close();
            conn.close();
        }catch (SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //finally block is used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            }catch (SQLException se2) {
            }// Nothing to do
                try{
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end Final Try
        }//end try
        System.out.println("Closing DB Connection - Goodbye!");

        return isValidUser;
    }
}
