/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit8;

/**
 *
 * @author Araceli Teruel
 */
public class Asignatura {
    
    private String nombre;
    private double nota;
    public Asignatura(String nombre)
    {
        this.nombre=nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public double getNota()
    {
        return nota;
    }
    public void setNota(double nota)
    {
        this.nota=nota;
    }
    
}
