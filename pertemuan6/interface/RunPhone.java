/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan07_Interface;
import java.util.Scanner;



/**
 *
 * @author mmccom
 */
public class RunPhone {
    static void printMenu(){
            System.out.println("");
            System.out.println("Silahkan Pilih opsi di bawah ini");
            System.out.println("1. Xiaomi");
            System.out.println("2. Samsung");
            System.out.println("3. Oppo");
            System.out.println("4. Keluar");
        }
    
    
    public static void main(String[] args) {
        Phone readmiNote11 = new Xiaomi();
        Phone GalaxyS21 = new Samsung(); 
        Phone OppoA57 = new Oppo();
        
        PhoneUser Alvi = new PhoneUser(readmiNote11);
        PhoneUser Alvi1 = new PhoneUser(GalaxyS21);
        PhoneUser Alvi2 = new PhoneUser(OppoA57);
        
        System.out.println("Selamat Datang di Sistem PHONE");
        int menu;
        
        do{
            printMenu();
            System.out.println("Masukkan Pilihan Anda : ");
            Scanner input1 = new Scanner(System.in);
            menu = input1.nextInt();
            
            switch(menu){
                case 1:
                    
                    System.out.println("Anda Memilih Opsi 1. Xiaomi ");
                    Alvi.turnOnThePhone();
                    Scanner input = new Scanner(System.in);
                    String aksi = null;
                    do{
              
                    while(true){
           System.out.println("======== APLIKASI INTERFACE ========");
           System.out.println("[1] Nyalakan HP");
           System.out.println("[2] Matikan HP");
           System.out.println("[3] Perbesar Volume");
           System.out.println("[4] Kecilkan Volume");
           System.out.println("[5] Recovry Mode");
           System.out.println("[6] Screenshot");
           System.out.println("[0] Keluar");
           System.out.println("Pilih Aksi : ");
           aksi = input.nextLine();
           
                switch (aksi) {
                    case "1":
                        Alvi.turnOnThePhone();
                        break;
                    case "2":
                        Alvi.turnOffThePhone();
                        break;
                    case "3":
                        Alvi.makePhoneLouder();
                        break;
                    case "4":
                        Alvi.makePhoneSilent();
                        break;
                    case "5":
                        Alvi.RecoveryMode();
                        break;
                    case "6":
                        Alvi.TangkapanLayar();
                        break;
                    case "0":
                        System.exit(0);
                    default:
                        System.out.println("Salah Broooooo");
                        break;
                }
       }  
                    }while (menu != 7);
                case 2:
                    System.out.println("Anda Memilih Opsi 2. Samsung");
                    Alvi1.turnOnThePhone();
                    Scanner input2 = new Scanner(System.in);
                    String aksi1 = null;
                    do{
                    while(true){
           System.out.println("======== APLIKASI INTERFACE ========");
           System.out.println("[1] Nyalakan HP");
           System.out.println("[2] Matikan HP");
           System.out.println("[3] Perbesar Volume");
           System.out.println("[4] Kecilkan Volume");
           System.out.println("[5] Tangkapan Layar (Screenshot)");
           System.out.println("[6] Mode Pemulihan (Recovery)");
           System.out.println("[0] Keluar");
           System.out.println("Pilih Aksi : ");
           aksi1 = input2.nextLine();
           
                switch (aksi1) {
                    case "1":
                        Alvi1.turnOnThePhone();
                        break;
                    case "2":
                        Alvi1.turnOffThePhone();
                        break;
                    case "3":
                        Alvi1.makePhoneLouder();
                        break;
                    case "4":
                        Alvi1.makePhoneSilent();
                        break;
                    case "5":
                        Alvi1.TangkapanLayar();
                        break;
                    case "6":
                        Alvi1.RecoveryMode();
                        break;
                    case "0":
                        System.exit(0);
                    default:
                        System.out.println("Kaga Ada Pilihan lo Brooo...");
                        break;
                }
       } 
                    }while (menu != 7);
                case 3:
                    System.out.println("Anda Memilih Opsi 3. Oppo");
                    Alvi2.turnOnThePhone();
                    Scanner input3 = new Scanner(System.in);
                     String aksi2 = null;
                     do{ 
                     while(true){
           System.out.println("======== APLIKASI INTERFACE ========");
           System.out.println("[1] Nyalakan HP");
           System.out.println("[2] Matikan HP");
           System.out.println("[3] Perbesar Volume");
           System.out.println("[4] Kecilkan Volume");
           System.out.println("[5] Tangkapan Layar (Screenshot)");
           System.out.println("[6] Mode Pemulihan (Recovery)");
           System.out.println("[0] Keluar");
           System.out.println("Pilih Aksi : ");
           aksi2 = input3.nextLine();
          
                switch (aksi2) {
                    case "1":
                        Alvi2.turnOnThePhone();
                        break;
                    case "2":
                        Alvi2.turnOffThePhone();
                        break;
                    case "3":
                        Alvi2.makePhoneLouder();
                        break;
                    case "4":
                        Alvi2.makePhoneSilent();
                        break;
                    case "5":
                        Alvi2.TangkapanLayar();
                        break;
                    case "6":
                        Alvi2.RecoveryMode();
                        break;
                    case "0":
                        System.exit(0);
                    default:
                        System.out.println("Pilih yang ada di Menu ya Sahabat.....");
                        break;
                }
       }  
                     }while (menu != 7);
                case 4:
                    System.out.println("Anda Memilih Opse 4. Keluar");
                    System.exit(4);
                    break;
                default:
                    System.out.println("Maaf Pilihan Anda tidak ada");
                    break;
            }
        }while (menu != 5);
       }       
    } 

