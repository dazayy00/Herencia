/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author johan
 */
public class Novelas extends Libro{
    private String tipo;

    public Novelas(String titulo, String autor, String tipo) {
        super(titulo, autor);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void imprimir(){
        System.out.println("titulo del libro "+ super.getTitulo());
        System.out.println("Autor del libro "+ super.getAutor());
        System.out.println("Tipo del libro " + tipo);
        System.out.println("precio del libro "+ super.getPrecio());
    }
}
