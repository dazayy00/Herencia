/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaMascotas;

/**
 *
 * @author johan
 */
public class Perros extends Mascota{
    protected double peso;
    protected boolean muerde;

    public Perros(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("El peso del perro es "+ peso);
        System.out.println("El perro "+ muerde +" muerde");
    }
    
    public static void sonido (){
        System.out.println("Los perros ladran");
    }
}
