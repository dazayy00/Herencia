/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaMascotas;

/**
 *
 * @author johan
 */
public class GatoPeloLargo extends Gatos{
    private RazaGatoPeloLargo raza;

    public GatoPeloLargo(String nombre, int edad, String color, double alturaS, double lSalto, RazaGatoPeloLargo raza) {
        super(nombre, edad, color, alturaS, lSalto);
        this.raza = raza;
    }

    public RazaGatoPeloLargo getRaza() {
        return raza;
    }

    public void setRaza(RazaGatoPeloLargo raza) {
        this.raza = raza;
    }

    public void descripcion(){
        switch(raza){
            case Angora -> System.out.println("de angola viene el wey");
            case Himalayo -> System.out.println("del himalaya este otro");
            case Balines -> System.out.println("ni idea de donde viene");
            case Somali -> System.out.println("de somalia viene este otro");
        }
    }
    
    @Override
    public void imprimir() {
        super.imprimir(); 
        System.out.println("La raza del gato es "+ raza);
    }
    
}
