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
public class ControlPersonal {
    private static ArrayList<Persona> personas;
    private ControlPersonal()
    {
        
    }
    public static void anyadirPersona(Persona p)
    {
        personas.add(p);
    }
    
    public static void ordenarPorDni()
    {
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
		return p1.getDni().compareTo(p2.getDni());
            }   
        });
    }
    public static void ordenarPorOrdenAlfabetico()
    {
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
		return p1.getNombre().compareTo(p2.getNombre());
            }   
        });
    }
    public static void mostrarListado()
    {
        for(int i=0;i<personas.size();i++)
        {
            if(personas.get(i).esProfesor())
                personas.get(i).mostrarListadoAsignaturasNota();
            else
                personas.get(i).mostrarListadoAsignaturasNota();
        }
    }
    public static void main(String[] args)
    {
        Asignatura a1=new Asignatura("Bases de datos");
        Asignatura a2=new Asignatura("Programación");
        Asignatura a3=new Asignatura("Entornos");
        
        Persona p1=new Profesor("Juan Carlos","01");
        Persona p2=new Profesor("Rosa","02");
        Persona p3=new Profesor("Nacho","03");
        
        Persona al1=new Alumno("Araceli","10");
        Persona al2=new Alumno("Alfonso","11");
        Persona al3=new Alumno("Jose","12");
        
        anyadirPersona(p1);
        anyadirPersona(p2);
        anyadirPersona(p3);
        anyadirPersona(al1);
        anyadirPersona(al2);
        anyadirPersona(al3);
        
        p1.anyadirAsignatura(a1);
        p2.anyadirAsignatura(a3);
        p3.anyadirAsignatura(a2);
        
        al1.anyadirAsignatura(a1);
        al1.anyadirAsignatura(a2);
        al1.anyadirAsignatura(a3);
        
        al2.anyadirAsignatura(a1);
        al2.anyadirAsignatura(a2);
        al2.anyadirAsignatura(a3);
        
        al3.anyadirAsignatura(a1);
        al3.anyadirAsignatura(a2);
        al3.anyadirAsignatura(a3);
        
        
    }
}
