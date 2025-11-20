/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaMascotas;

/**
 *
 * @author johan
 */
public class GatoPeloCorto extends Gatos{
    private RazaGatoPeloCorto raza;

    public GatoPeloCorto(String nombre, int edad, String color, double alturaS, double lSalto, RazaGatoPeloCorto raza) {
        super(nombre, edad, color, alturaS, lSalto);
        this.raza = raza;
    }

    public RazaGatoPeloCorto getRaza() {
        return raza;
    }

    public void setRaza(RazaGatoPeloCorto raza) {
        this.raza = raza;
    }

    public void descripcion(){
        switch(raza){
            case Azul_Ruso -> System.out.println("Un azul ruso xs");
            case Britanico -> System.out.println("gato britanico una chulada");
            case Manx -> System.out.println("carl max en gato ");
            case Devon_Rex -> System.out.println("devon rex nunca los escuche ");
        }
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("La raza del gato sin pelo es "+ raza);
    }
    
}
