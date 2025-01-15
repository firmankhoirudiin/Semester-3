/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author macintosh
 */
public class Pertemuan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         user us = new user();
        
        us.SetUsername("fiko");
        us.SetPasword("1234");
        
        System.out.println("Usernamenya = " + us.GetUsername());
        System.out.println("Passwordnya = " + us.GetPassword());
    }
    
    
    }

