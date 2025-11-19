/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

/**
 *
 * @author johan
 */
public class ApartamentoFamiliar extends Apartamento{
    protected static double valorA = 2000000;
    protected int valorAdmin;

    public ApartamentoFamiliar(int idI, int area, String direccion, int numH, int numB, int valorAdmin) {
        super(idI, area, direccion, numH, numB);
        this.valorAdmin = valorAdmin;
    }

    @Override
    void imprimir() {
        super.imprimir(); 
        System.out.println("Valor de la administracion "+ valorAdmin);
    }
    
    
}
