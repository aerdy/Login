/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login.DataBaseMaster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author aerdy
 */
public class DataBase {
    
   private static Connection conn;

    public static Connection getConnection(){
        if(conn==null){
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
            } catch (SQLException ex) {
 //               Logger.getLogger(DatabaseUtilities.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conn;
    }
    
}
