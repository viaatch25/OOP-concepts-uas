/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author viaa
 */
public class Beraksi implements InterfaceBeraksi {
int ac;


public void Hidupkan(){
if (this.ac==mati){
this.ac = hidup;
System.out.println("Hidupkan AC! –> AC Hidup");
}
else{
System.out.println("Hidupkan AC! –> AC Sudah Hidup");
}
}

public void Matikan() {
if (this.ac==hidup){
this.ac = mati;
System.out.println("Matikan AC! –> AC Mati");
}
else{
System.out.println("Matikan AC! –> AC Suadah Mati");
}
}


public void Panaskan() {
if(this.ac==dingin){
this.ac=panas;
System.out.println("Panaskan AC! –> Pemanas Nyala");
}
else{
System.out.println("Panaskan AC! –> Pemanas Sudah Nyala");
}
}


public void Dinginkan() {
if(this.ac==panas){
this.ac=dingin;
System.out.println("Dinginkan AC! –> Pendingin Nyala");
}
else{
System.out.println("Dinginkan AC! –> Pendingin Sudah Nyala");
}
}
}
