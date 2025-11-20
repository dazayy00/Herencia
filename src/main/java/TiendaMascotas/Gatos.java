/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaMascotas;

/**
 *
 * @author johan
 */
public class Gatos extends Mascota{
    protected double alturaS;
    protected double lSalto;

    public Gatos(String nombre, int edad, String color, double alturaS, double lSalto) {
        super(nombre, edad, color);
        this.alturaS = alturaS;
        this.lSalto = lSalto;
    }

    public double getAlturaS() {
        return alturaS;
    }

    public void setAlturaS(double alturaS) {
        this.alturaS = alturaS;
    }

    public double getlSalto() {
        return lSalto;
    }

    public void setlSalto(double lSalto) {
        this.lSalto = lSalto;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("La altura de salto del gato es de "+ alturaS);
        System.out.println("La longuitud del salto del gato es de "+ lSalto);
    }
    
    
    public static void Sonido(){
        System.out.println("Los gatos maullan y ronronean");
    }
}
