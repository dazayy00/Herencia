/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author johan
 */
public class LibroUNC extends LibroTexto{
    private String facu;

    public LibroUNC(String titulo, String autor, String curso, String facu) {
        super(titulo, autor, curso);
        this.facu = facu;
    }

    public String getFacu() {
        return facu;
    }

    public void setFacu(String facu) {
        this.facu = facu;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Nombre del libro "+ super.getTitulo());
        System.out.println("Autor del libro "+ super.getAutor());
        System.out.println("Curso donde se uso el libro "+ super.getCurso());
        System.out.println("Facultad donde se usa el libro "+ facu);
        System.out.println("precio del libro "+ super.getPrecio());
    }
}
