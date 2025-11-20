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
    
   public void descripcion(){
       switch(raza){
           case Esfinge -> System.out.println("gato esfinge");
           case Elfo -> System.out.println("Elfos y gnomos");
           case Donskoy -> System.out.println("No se cual sea ");
       }
   }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("La raza del gato sin pelo es "+ raza);
    }
    
    
}
