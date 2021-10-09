/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Win10
 */
public class ClsConexion {
    private final String JDBC_URL = "jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
    private final String JDBC_USER = "root";
    private final String JDBC_PWD = "progra1";
    private Connection con = null;
    
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.JDBC_URL, this.JDBC_USER, this.JDBC_PWD);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClsConexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClsConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
       return con; 
    }
}
