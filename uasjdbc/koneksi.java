/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasjdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class koneksi {

   static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    String  statuskoneksi="";
    
    public void koneksi() {
        
         
        
        try {
            String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost/CRYPTO";
        String USER = "root";
        String PASS = "";
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            
            // buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            
            statuskoneksi  =  "    OPEN ACCESS";
            System.out.println("koneksi  berhasil");
          //JOptionPane.showMessageDialog(null, "Berhasil Koneksi");
            }
       
        catch (Exception e) {
            statuskoneksi  ="      NO ACCESS";
            System.out.println("koneksi gagal"+e);
            //JOptionPane.showMessageDialog(null, "Gagal Koneksi Karena " + e);
              
        }
    }
}