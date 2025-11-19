/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

/**
 *
 * @author johan
 */
public class Oficina extends Local{
    protected static double valorA = 3500000;
    protected boolean esG;

    public Oficina(int idI, int area, String direccion, tipo tipoLocal, boolean esG) {
        super(idI, area, direccion, tipoLocal);
        this.esG = esG;
    }

    @Override
    void imprimir() {
        super.imprimir(); 
        System.out.println("Es oficina gubernamental "+ esG);
    }
    
    
}
