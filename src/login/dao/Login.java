/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login.dao;

/**
 *
 * @author aerdy
 */
public class Login {
    public String user;
    public String password;
    
  
    public Login(String user , String password){
        this.user=user;
        this.password=password;
    }

    public Login() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public String getUser(){
        return user;
    }
    public void setUser(String User){
        this.user=user;
    }
    
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password= password;
    }

    public void getUser(String user) {
        //throw new UnsupportedOperationException("Not yet implemented");
    }

    public void getPassword(String text) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}
