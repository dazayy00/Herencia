/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

/**
 *
 * @author johan
 */
public class Apartaestudio extends Apartamento{
    protected static double valorA = 1500000;

    public Apartaestudio(int idI, int area, String direccion, int numH, int numB) {
        super(idI, area, direccion, 1, 1);
    }

    @Override
    void imprimir() {
        super.imprimir();
    }

}
