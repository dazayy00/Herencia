package Banco;

public class CuentaBancaria {
    protected float saldo;
    protected int numc = 0;
    protected int numr = 0;
    protected float tasaanual;
    protected float comision = 0;

    public CuentaBancaria(float saldo, float tasaanual) {
        this.saldo = saldo;
        this.tasaanual = tasaanual;
    }
    
    public void consignar(float cantidad){
        saldo = saldo + cantidad;
        
        numc = numc + 1;
    }
    
    public void retirar(float cantidad){
        float nsaldo = saldo + cantidad;
        
        if(nsaldo >= 0){
            saldo -= cantidad;
            numr = numr + 1;
        } else {
            System.out.println("La cantidad a retirar excede el saldo actual");
        }
    }
    
    public void calcularInteres(){
        float tasaM = tasaanual / 12;
        
        float intM = saldo * tasaM;
        saldo += intM;
    }
    
    public void extaM(){
        saldo -= comision;
        calcularInteres();
    }
}
