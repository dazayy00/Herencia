package Banco;

import java.util.*;

public class Prueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial ");
        float saldoinicial = sc.nextFloat();
        System.out.println("Ingrese tasa de interes ");
        float tasaahorro = sc.nextFloat();
        
        CuentaAhorros cuenta1 = new CuentaAhorros(saldoinicial, tasaahorro);
        System.out.println("Ingrese la cantidad a consignar ");
        float deposito = sc.nextFloat();
        cuenta1.consignar(deposito);
        
        System.out.println("Ingrese la cantidad a retirar ");
        float retiro = sc.nextFloat();
        cuenta1.retirar(retiro);
        cuenta1.extaM();
        cuenta1.imprimir();
    }
    
}
