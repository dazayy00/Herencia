/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

/**
 *
 * @author johan
 */
public class CasaConjuntoCerrado extends CasaUrbana{
    protected static double valorA = 2500000;
    protected int valorAdmin;
    protected boolean tienePiscina;
    protected boolean tieneCampos;

    public CasaConjuntoCerrado(int idI, int area, String direccion, int numH, int numB, int numP, int valorAdmin, boolean tienePiscina, boolean tieneCampos) {
        super(idI, area, direccion, numH, numB, numP);
        this.valorAdmin = valorAdmin;
        this.tienePiscina = tienePiscina;
        this.tieneCampos = tieneCampos;
    }

    @Override
    void imprimir() {
        super.imprimir(); 
        System.out.println("Valor de la administracion "+ valorAdmin);
        System.out.println("Tiene piscina? "+ tienePiscina);
        System.out.println("tiene campo deportivo? "+ tieneCampos);
    }
    
    
}
