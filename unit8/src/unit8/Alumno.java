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
public class Alumno extends Persona{
    
    public Alumno(String nombre,String dni)
    {
        super(nombre,dni);
    }
    @Override
    public boolean esProfesor()
    {
        return false;
    }
}
