/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login.interdace;

import java.sql.SQLException;
import login.dao.Login;

/**
 *
 * @author aerdy
 */
public interface  interfac {
    
   void insert(Login login)throws SQLException;

    Login getLogin() throws SQLException;
    
}
