/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

/**
 *
 * @author johan
 */
public class Inmueble {
    protected int idI;
    protected int area;
    protected String direccion;
    protected double precioV;

    public Inmueble(int idI, int area, String direccion) {
        this.idI = idI;
        this.area = area;
        this.direccion = direccion;
    }
    
    double CalcularPrecioVenta(double valorA){
        precioV = area * valorA;
        return precioV;
    }
    
    void imprimir(){
        System.out.println("Identificador inmobiliario "+ idI);
        System.out.println("Area "+ area);
        System.out.println("Direccion "+ direccion);
        System.out.println("Precio de venta "+ precioV);
    }
}
