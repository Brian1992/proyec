package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
@With(Secure.class)
public class Application extends Controller {

    
    
    public static void index() {
        render();
    }

        public static void login(){
           
              
            render();
        }
         public static void autenticar(String usuario , String password){
             session.put("usuario", usuario);
             index();
        }
}