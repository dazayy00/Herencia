/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author johan
 */
public class CuentaCorriente extends CuentaBancaria{
    float sobregiro;

    public CuentaCorriente(float saldo, float tasa) {
        super(saldo, tasa);
        sobregiro = 0;
    }

    public void retirar(float cantidad){
        float res = saldo - cantidad;
        
        if(res < 0){
            sobregiro = sobregiro - res;
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }
    
    public void consignar(float cantidad){
        float residuo = sobregiro - cantidad;
        
        if(sobregiro > 0){
            if(sobregiro > 0) {
                sobregiro = 0;
                saldo = residuo;
            } else {
                sobregiro = -residuo;
                saldo = 0;
            }
        } else {
            super.consignar(cantidad);
        }
    }
    
    public void extaM(){
        super.extaM();
    }
    
    public void imprimir(){
        System.out.println("saldo "+ saldo);
        System.out.println("comision mensual "+ comision);
        System.out.println("Numero de transacciones "+ (numc + numr));
        System.out.println("Valor de sobregiro "+ (numc + numr));
        System.out.println();
    }
}
