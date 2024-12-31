/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author via
 */

    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

/**
 * @author User
 */
public class handphoneberaksi {

    public static void main(String[] args) {
        handphone hpvia = new handphone();

        hpvia.hp = "Handphone Hidup...";
        hpvia.hp = "Kring, Kring, Kring...panggilan dilakukan";
       hpvia.hp = "Dung, dung...sms berhasil terkirim";
        hpvia.hp = "Handphone Mati...";

        hpvia.printhidupkan();
       hpvia.printlakukanpanggilan();
      hpvia.printkirimSMS();
       hpvia.printmatikan();
    }
    
}


