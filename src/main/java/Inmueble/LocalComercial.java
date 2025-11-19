/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

/**
 *
 * @author johan
 */
public class LocalComercial extends Local{
    protected static double valorA = 3000000;
    protected String centroComercial;

    public LocalComercial(int idI, int area, String direccion, tipo tipoLocal, String centroComercial) {
        super(idI, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Centro comercial "+ centroComercial);
    }
    
    
}
