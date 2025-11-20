/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

/**
 *
 * @author johan
 */
public class Profesor extends Persona{
    private String depa;
    private String cate;

    public Profesor(String nombre, String direccion, String depa, String cate) {
        super(nombre, direccion);
        //this.depa = depa;
        //this.cate = cate;
        System.out.println("departamento "+ depa);
        System.out.println("cateforia  "+ cate);
    }

    public String getDepa() {
        return depa;
    }

    public void setDepa(String depa) {
        this.depa = depa;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }
    
}
