/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login.interdace.Implement;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import login.DataBaseMaster.DataBase;
import login.dao.Login;
import login.interdace.interfac;

/**
 *
 * @author aerdy
 */
public class logImple implements interfac{
    Login log = new Login();
     

    public void insert(Login login) throws SQLException {
        
    }

    public Login getLogin() throws SQLException {
     //   throw new UnsupportedOperationException("Not supported yet.");
         
        java.sql.Statement st=DataBase.getConnection().createStatement();
        String sql = new String();
        sql="SELECT *FROM login WHERE user ='"+log.getUser()+"' and password='"+log.getPassword()+"'";
       
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
            String nama =rs.getString("user");
            String alamat =rs.getString("password");
            
           // return (Login) rs;
            
        }
        return log;
     
    }
    
}
