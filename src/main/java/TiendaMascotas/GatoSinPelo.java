/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaMascotas;

/**
 *
 * @author johan
 */
public class GatoSinPelo extends Gatos{
    
    private RazaGatoSinPelo raza;

    public GatoSinPelo(String nombre, int edad, String color, double alturaS, double lSalto, RazaGatoSinPelo raza) {
        super(nombre, edad, color, alturaS, lSalto);
        this.raza = raza;
    }

    public RazaGatoSinPelo getRaza() {
        return raza;
    }

    public void setRaza(RazaGatoSinPelo raza) {
        this.raza = raza;
    }
    
    //agregar switch

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("La raza del gato sin pelo es "+ raza);
    }
    
    
}
