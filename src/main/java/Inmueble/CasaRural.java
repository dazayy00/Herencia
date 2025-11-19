/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

/**
 *
 * @author johan
 */
public class CasaRural extends Casa{
    protected static double valorArea = 1500000;
    protected int dist;
    protected int altitud;

    public CasaRural(int idI, int area, String direccion, int numH, int numB, int numP, int dist, int altitud) {
        super(idI, area, direccion, numH, numB, numP);
        this.dist = dist;
        this.altitud = altitud;
    }
    
    @Override
    void imprimir(){
        super.imprimir();
        System.out.println("Distancia de la cabecera municipal "+ dist +" KM");
        System.out.println("Altitud sobre el nivel del mar "+ altitud +" Metros");
    }
}
