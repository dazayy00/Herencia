/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

/**
 *
 * @author johan
 */
public class Casa extends InmuebleVivienda{
    protected int numP;

    public Casa(int idI, int area, String direccion, int numH, int numB, int numP) {
        super(idI, area, direccion, numH, numB);
        this.numP = numP;
    }
    
    @Override
    void imprimir(){
        super.imprimir();
        System.out.println("Numero de pisos "+ numP);
    }
}
