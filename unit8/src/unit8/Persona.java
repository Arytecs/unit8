/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit8;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Araceli Teruel
 */
public abstract class Persona {
    protected String nombre;
    protected String dni;
    protected ArrayList<Asignatura> asignaturas;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    
    public Persona(String nombre, String dni)
    {
        this.nombre=nombre;
        this.dni=dni;
    }
    
    public void anyadirAsignatura(Asignatura a)
    {
        asignaturas.add(a);
    }
    public abstract boolean esProfesor();
    public void mostrarListadoAsignaturasNota()
    {
        out.println("Nombre: "+nombre);
        out.println("Asignaturas cursando:");
        for(int i=0;i<asignaturas.size();i++)
        {
            out.println((i+1)+". "+asignaturas.get(i).getNombre()+". Nota: "+asignaturas.get(i).getNota());
        }
    }
    public void ordenarPorAsignaturas()
    {
        Collections.sort(asignaturas, new Comparator<Asignatura>() {
            @Override
            public int compare(Asignatura p1, Asignatura p2) {
		return new String(p1.getNombre()).compareTo(new String(p2.getNombre()));
            }   
        });
    }
    public void ordenarPorNota()
    {
        Collections.sort(asignaturas, new Comparator<Asignatura>() {
            @Override
            public int compare(Asignatura p1, Asignatura p2) {
		return new Double(p1.getNota()).compareTo(new Double(p2.getNota()));
            }   
        });
    }
    
}
