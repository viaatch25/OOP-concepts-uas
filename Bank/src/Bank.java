public class Bank
{
    //  Variable
    int saldo;
     
    //  Konstruktor
    public Bank(int saldo)
    {
        this.saldo = saldo;
    }
     
    //  Method simpanUang
    public void simpanUang(int value)
    {
        saldo += value;
    }
     
    //  Method ambilUang
    public void ambilUang(int value)
    {
        saldo -= value;
    }
     
    //  Method getSaldo
    public int getSaldo()
    {
        return saldo;
    }
}
