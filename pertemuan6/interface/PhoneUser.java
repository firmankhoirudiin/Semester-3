/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan07_Interface;

/**
 *
 * @author mmccom
 */
public class PhoneUser {
    private final Phone phone;
            
     public PhoneUser(Phone phone){
         this.phone = phone;
     }       
     
     void turnOnThePhone(){
         this.phone.powerOn();
     }
     
     void turnOffThePhone(){
         this.phone.powerOf();
     }
     
     void makePhoneLouder(){
         this.phone.volumeUp();
     }
     
     void makePhoneSilent(){
         this.phone.volumeDown();
     }
     
     void TangkapanLayar(){
         this.phone.Screenshot();
     }
     
     void RecoveryMode(){
         this.phone.Recovery();
     }
}
