/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;

/**
 *
 * @author ThinkAgain
 */
public class Matematika {
private int a,b,pertambahan,pengurangan,perkalian,pembagian;
void setpertambahan(int a, int b){
pertambahan=a+b;
}

void setpengurangan (int a, int b){
pengurangan=a-b;
}

void setperkalian(int a, int b){
perkalian=a*b;
}

void setpembagian(int a, int b){
pembagian=a/b;
}

int getpertambahan(){
return pertambahan;
}
int getpengurangan(){
return pengurangan;
}

int getperkalian(){
return perkalian;
}
int getpembagian(){
return pembagian;
}
}
    
