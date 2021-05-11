/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.clases;

/**
 *
 * @author Edson Coj
 */
public class ActividadClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona Alumno = new Persona();
        Alumno.setNombre("Edson C. Coj Uc");
        Alumno.setTipo("Alumno");
        Alumno.setSexo('M');
        Alumno.setEdad(21);
        Alumno.setCurp("COUE991207HCCJCD09");
        Alumno.setActividad("El alumno tiene que tomar clases");

        System.out.println(Alumno);
        Alumno.Salida();

        Edificio Biblioteca = new Edificio();
        Biblioteca.setArea("Biblioteca");
        Biblioteca.setCampus("Campus V Ingenieria");
        Biblioteca.setEnergiaElectrica(true);
        Biblioteca.setMts2(523);
        
        System.out.println(Biblioteca);
        Biblioteca.Capacidad();


      

       
       
       
        
       
       
    }
    
}
