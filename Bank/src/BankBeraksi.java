import java.util.Scanner;
  
public class BankBeraksi
{
    public static void main(String[] args)
    {
        //  Objek Scanner
        Scanner scan = new Scanner(System.in);
         
        //  Buat objek dari class Bank Saldo Awal
        Bank obj_bank = new Bank(100000);
        
        System.out.println("Selamat Datang di Bank via");
        System.out.println("Saldo Saat Ini   : Rp. "+ obj_bank.getSaldo());    //  Panggil method getSaldo
        
        System.out.print("\nSimpan Uang Anda : Rp. ");  
        int simpan = scan.nextInt();
        obj_bank.simpanUang(simpan);    //  Panggil method simpanUang
         
        System.out.println("Saldo saat ini   : Rp."+ obj_bank.getSaldo());    //  Panggil method getSaldo
        
        System.out.print("\nAmbil Uang Anda  : Rp. ");  int ambil = scan.nextInt();
        obj_bank.ambilUang(ambil);      //  Panggil method ambilUang
         
        System.out.println("Saldo Saat Ini   : Rp. "+obj_bank.getSaldo());
    }
}
