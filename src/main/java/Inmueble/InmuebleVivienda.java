/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

/**
 *
 * @author johan
 */
public class InmuebleVivienda extends Inmueble{
    protected int numH;
    protected int numB;

    public InmuebleVivienda(int idI, int area, String direccion, int numH, int numB) {
        super(idI, area, direccion);
        this.numH = numH;
        this.numB = numB;
    }
    
    @Override
    void imprimir(){
        super.imprimir();
        System.out.println("Numero de habitaciones "+ numH);
        System.out.println("Numero de baños"+ numB);
    }
}
