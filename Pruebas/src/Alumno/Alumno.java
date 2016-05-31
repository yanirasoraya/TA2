/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;

/**
 *
 * @author YANI
 */
public class Alumno {
    
    String Nombre;
    String Apellido;
    String DNI;
    String Carrera;
    int edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }    
    
     public Alumno(int edad, String Nombre, String Apellido){
        this.edad = edad;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
     
     public static Alumno getDatosAlumno(){
        /**
         * hiding logic to get highest paid employee
         */
        return new Alumno(20, "Nat", "Torres");
    }

     
}