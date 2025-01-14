/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author macintosh
 */
public class ubah {
    
   koneksi konek = new koneksi();
    void ubah(String nim,String nama, String alamat, String jeniskelamin)
        {
            
             
             try
        {
// Mengupdate nama mahasiswa berdasarkan NIM
            konek.konek();
           java.sql.Statement ubah = konek.conn.createStatement();
            String sql = "UPDATE identitas SET nim = '"+nim+"', nama = '"+nama+"', alamat = '"+alamat+"', jeniskelamin = '"+jeniskelamin+"' WHERE nim = '"+nim+"'";

            ubah.executeUpdate(sql);
            ubah.close();
            JOptionPane.showMessageDialog(null, "berhasil di ubah");
            System.out.println("ubah query...");
            
        }
        catch(Exception er)
        {
            JOptionPane.showMessageDialog(null,er);
            System.out.println(er);
        }
        }
    
}
