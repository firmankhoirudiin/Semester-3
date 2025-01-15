/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TipeData;

/**
 *
 * @author WINDOWS 10
 */
public class PraktikTipeData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Tipe Data String
        String nama, almt, nim, tgl, no;
       
        //Tipe Data Int
        int umur, smt;
        
        //Tipe Data Double
        double tb, bb;
        
        //Tipe Data Char
        char kls;
        
        //Variable
        nama = "Achmad Alvi Yudanuari";
        nim = "2255201034";
        smt = 3;
        kls = 'A';
        almt = "Desa Kendalrejo, Kecamatan Talun";
        tgl = "03 Januari 2004";
        umur = 19;
        no = "085722123135";
        tb = 169.6;
        bb = 75.4;
        
        //Output
        System.out.println("Nama          = " + nama);
        System.out.println("Nim           = " + nim);
        System.out.println("Semester      = " + smt);
        System.out.println("Kelas         = " + kls);
        System.out.println("Alamat        = " + almt);
        System.out.println("Tanggal Lahir = " + tgl);
        System.out.println("Umur          = " + umur + " tahun");
        System.out.println("No.Hp         = " + no);
        System.out.println("Tinggi Badan  = " + tb + " cm");
        System.out.println("Berat Badan   = " + bb + " kg");
       
    }
    
}
