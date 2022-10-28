/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.*;

/**
 *
 * @author kevin
 */
public class Conexion {

    private static Connection c = null;
    
    public static Connection obtener() throws SQLException, ClassNotFoundException{
        if( c == null ){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost/base1","root","");
            } catch(SQLException ex){
                throw new SQLException(ex);
            } catch(ClassNotFoundException ex){
                throw new ClassCastException(ex.getMessage());
            }
        } 
        return c;
    }
    
    public static void cerrar() throws SQLException{
        if( c != null ){
            c.close();
        }
    }
    
}  
    
    
