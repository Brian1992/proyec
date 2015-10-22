/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author Brian Barrón Diáz
 */
public class Security  extends Secure.Security {
    
    static boolean authenticate(String username, String password) {
        User user = User.find("byEmail", username).first();
        return user != null && user.password.equals(password);
    }
    
}
@With(Secure.class)
public class Application extends Controller {
    
    public static void index() {
        String user = Security.connected();
        render(user);
    }
}
