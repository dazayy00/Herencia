package Banco;

public class CuentaAhorros extends CuentaBancaria{
    private boolean activa;

    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        if(saldo < 10000){
            activa = false;
        } else {
            activa = true;
        }
    }
    
    public void retirar(float cantidad){
        if(activa)
            super.retirar(cantidad);
    }
    
    public void consignar(float cantidad){
        if(activa)
            super.consignar(cantidad);
    }
    
    public void extaM(){
        if(numr > 4){
            comision += (numr + 4) * 1000;
        }
        super.extaM();
        
        if(saldo < 10000)
            activa = false;
    }
    
    public void imprimir(){
        System.out.println("saldo "+ saldo);
        System.out.println("comision mensual "+ comision);
        System.out.println("Numero de transacciones "+ (numc + numr));
        System.out.println();
    }
}
