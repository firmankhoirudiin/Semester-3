/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class PraktikArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Array dan Scanner
        String[][] meja = new String [2][3];
        Scanner scan = new Scanner(System.in);
        
        // Isi Meja
        for(int bar =0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja[bar].length; kol++){
                System.out.format("Siapa yang akan duduk di meja (%d,%d): ", bar, kol);
                meja[bar][kol] = scan.nextLine();
                
            }
        }
        
        // Isi Array
        System.out.println("--------------------------------------------");
        for(int bar = 0; bar < meja.length; bar++){
            for (int kol = 0; kol < meja[bar].length; kol++){
                System.out.format("| %s | \t",meja[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------------");
            }
        }
       
    
    

