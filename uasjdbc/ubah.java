/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasjdbc;

/**
 *
 * @author macintosh
 */
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author macintosh
 */
public class ubah {
    
   koneksi konek = new koneksi();
    void ubah(String nama, String alamat, String status, String klass,String jenis_kelamin)
        {
            
             
             try
        {
// Mengupdate nama mahasiswa berdasarkan NIM
            konek.koneksi();
           java.sql.Statement ubah = konek.conn.createStatement();
            String sql = "UPDATE ADMIN SET NAMA = '"+nama+"', ALAMAT = '"+alamat+"', STATUS = '"+status+"', CLASS = '"+klass+"',JENIS_KELAMIN ='"+jenis_kelamin+"' WHERE NAMA = '"+nama+"'";

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
