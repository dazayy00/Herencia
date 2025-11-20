/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

/**
 *
 * @author johan
 */
public class Estudiante extends Persona{
    private String carrera;
    private int sem;

    public Estudiante(String nombre, String direccion, String carrera, int sem) {
        super(nombre, direccion);
        System.out.println("carrera  "+ carrera);
        System.out.println("semestre "+ sem);
        //this.carrera = carrera;
        //this.sem = sem;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }
    
}
