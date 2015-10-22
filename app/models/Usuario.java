/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import javax.persistence.Entity;
import play.data.validation.Email;
import play.data.validation.MaxSize;
import play.data.validation.Password;
import play.data.validation.Required;
import play.db.jpa.Model;
/**
 *
 * @author Brian Barrón Díaz
 */
@Entity
public class Usuario extends Model{
    @Required
    @MaxSize(value=20)
    public String usuario;
    @Password
    public String password;
    public String primerApellido;
    public String segundApellido;
    public String nombre;
    public Date fechaNacimiento;
    @Email
    public String email;
    
    @Override
    public String toString(){
        return String.format("%s %s", this.nombre, this.primerApellido);
    }
}
