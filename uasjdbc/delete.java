/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class delete {
    
    koneksi konek = new koneksi();
    
    
    public void delete(String nama)
    {
        System.out.println("running Insert");

        try
        {
            konek.koneksi();
            String sql="DELETE FROM `ADMIN` WHERE NAMA= '"+nama+"'";
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
