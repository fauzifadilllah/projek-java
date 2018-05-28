/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytaskk;
import java.sql.*;
import javax.swing.*;
import java.sql.DriverManager;
/**
 *
 * @author Axellon
 */
public class koneksi {
    private static Connection Cn;
  public static Connection getKoneksi(){
    if (Cn == null){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
            Cn = DriverManager.getConnection("jdbc:mysql://localhost/db_projekjava","root","");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    return Cn;
  }
  
}
