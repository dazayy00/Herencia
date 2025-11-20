/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaMascotas;

/**
 *
 * @author johan
 */
public class PChico extends Perros{

    private RazaPerroChico raza;

    public PChico(String nombre, int edad, String color, double peso, boolean muerde, RazaPerroChico raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public RazaPerroChico getRaza() {
        return raza;
    }

    public void setRaza(RazaPerroChico raza) {
        this.raza = raza;
    }
    
    public void descripcion(){
        switch (raza) {
            case Caniche -> System.out.println("El caniche qn sabe cual es ");
            case Yorkshire_Terrier -> System.out.println("El Yorkshire Terrier nmms el nombre jajaja");
            case Schnauzer -> System.out.println("El fuller");
            case Chihuahua -> System.out.println("El mx");
        }
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("La raza del perro es "+ raza);
    }
    
}
