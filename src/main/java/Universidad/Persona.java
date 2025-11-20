/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

/**
 *
 * @author johan
 */
public class Persona {
    private String nombre;
    private String direccion;

    public Persona(String nombre, String direccion) {
        //this.nombre = nombre;
        System.out.println("Nombre "+ nombre);
        System.out.println("direccion "+ direccion);
        //this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void imprimir(){
        System.out.println("Nombre "+ nombre);
        System.out.println("Direccion "+ direccion);
    }
}
