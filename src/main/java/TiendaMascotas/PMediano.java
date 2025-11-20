/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaMascotas;

/**
 *
 * @author johan
 */
public class PMediano extends Perros{
    
    private RazaPerroMediano raza;

    public PMediano(String nombre, int edad, String color, double peso, boolean muerde, RazaPerroMediano raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public RazaPerroMediano getRaza() {
        return raza;
    }

    public void setRaza(RazaPerroMediano raza) {
        this.raza = raza;
    }
    
    public void descripcion(){
        switch(raza){
            case Collie -> System.out.println("El collie es un perro nomas");
            case Dalmata -> System.out.println("El dalmata es un perro nomas");
            case Bulldog -> System.out.println("El bulldog es un perro nomas");
            case Galgo -> System.out.println("El galgo es un perro nomas");
            case Sabueso -> System.out.println("El sabueso es un perro nomas");
        }
    }

    @Override
    public void imprimir() {
        super.imprimir(); 
        System.out.println("La raza del perro es "+ raza);
    }
    
}
