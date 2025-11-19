/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

/**
 *
 * @author johan
 */
public class CasaIndependiente extends CasaUrbana{
    protected static double valorA = 3000000;

    public CasaIndependiente(int idI, int area, String direccion, int numH, int numB, int numP) {
        super(idI, area, direccion, numH, numB, numP);
    }

    @Override
    void imprimir() {
        super.imprimir(); 
    }
    
    
}
