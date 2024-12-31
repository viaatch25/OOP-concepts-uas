/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author ThinkAgain
 */
public class MatematikaCanggihBeraksi {
public static void main(String[] args) {
MatematikaCanggih Mtk = new MatematikaCanggih();

Mtk.setpertambahan(25,20);
System.out.println("Hasil Tambah="+Mtk.getpertambahan());
Mtk.setperkalian(13,2);
System.out.println("Hasil Kali="+Mtk.getperkalian());
Mtk.setpembagian(30,2);
System.out.println("Hasil Bagi="+Mtk.getpembagian());
Mtk.setmodulus(3,7);
System.out.println("Hasil Modulus="+Mtk.getmodulus());
}
}
