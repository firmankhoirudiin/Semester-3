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
public class delete {
    
    koneksi konek = new koneksi();
    
    
    public void delete(String nim1)
    {
        System.out.println("running Insert");

        try
        {
            konek.konek();
            String sql="DELETE FROM `identitas` WHERE nim = '"+nim1+"'";
          PreparedStatement state = konek.conn.prepareStatement(sql);
          
          
// data akan diambil lewat nama textField.getText


          state.execute();
          
            System.out.println("data dimasukkan");
// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
//menampilkan.setText(mah_nim.getText()+"\n"+mah_nama.getText()+"\n"+mah_alamat.getText()+"\n"+mah_fak_id.getText()+"\n"+jenis);

          JOptionPane.showMessageDialog(null,"Berhasil Dihapus");
          
        }
        catch(Exception ex)
        {
            System.out.println("gagal  insert"+ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
