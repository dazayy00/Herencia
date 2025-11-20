/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaMascotas;

/**
 *
 * @author johan
 */
public class PGrande extends Perros{

    private RazaPerroGrande raza;
    
    public PGrande(String nombre, int edad, String color, double peso, boolean muerde, RazaPerroGrande raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public RazaPerroGrande getRaza() {
        return raza;
    }

    public void setRaza(RazaPerroGrande raza) {
        this.raza = raza;
    }

    public void descripcion(){
        switch (raza) {
            case Doberman -> System.out.println("El Doberman es un perro grande y fuerte");
            case Rotweiller -> System.out.println("El Rotweiller es un perro robusto");
            case Pastor_Aleman -> System.out.println("El pastor aleman es un perro leal");
        }
    }

    @Override
    public void imprimir() {
        super.imprimir(); 
        System.out.println("La raza del perro grande es "+ raza);
    }
    
    
}
