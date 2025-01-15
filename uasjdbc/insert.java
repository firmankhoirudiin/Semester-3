/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasjdbc;

/**
 *
 * @author macintosh
 */
import com.mysql.cj.xdevapi.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author macintosh
 */
public class insert {
    
    
    
    koneksi konek = new koneksi();
    
    
    public void insert(String NAMA, String ALAMAT , String STATUS, String CLASS,String JENIS_KELAMIN)
    {
        System.out.println("running Insert");

        try
        {
            konek.koneksi();
            String sql="insert into ADMIN (NAMA,ALAMAT,STATUS,CLASS,JENIS_KELAMIN)  values('"+NAMA+"','"+ALAMAT+"','"+STATUS+"','"+CLASS+"','"+JENIS_KELAMIN+"');";
          PreparedStatement state = konek.conn.prepareStatement(sql);
          
          
// data akan diambil lewat nama textField.getText


          state.execute();
          
            System.out.println("data dimasukkan");
// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
//menampilkan.setText(mah_nim.getText()+"\n"+mah_nama.getText()+"\n"+mah_alamat.getText()+"\n"+mah_fak_id.getText()+"\n"+jenis);

          JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
          
        }
        catch(Exception ex)
        {
            System.out.println("gagal  insert"+ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
