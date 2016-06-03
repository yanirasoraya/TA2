package pruebas;

import Alumno.Alumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pruebas {
    
    public float Division(float n1, float n2)
    {
        float division = 0;
        
        
            division = (float)(n1 / n2);            
        
       
        return division;        
    }
    
    public int suma(int n1, int n2)
    {
        int suma = 0;
        
            suma=n1+n2;       
        
        return suma;        
    }
      
    public static boolean EsPar(int n1)
    {
        boolean rpta = false;
        
        if(n1 % 2 == 0)
        {
            rpta = true;
        }
        return rpta;
    }
    
    public  String Frase(String Texto)
    {
        String frase="";
        
        for (int x = 0; x < Texto.length(); x++) 
        {
            if (Texto.charAt(x) != ' ')
                frase += Texto.charAt(x);
        }
        
        return frase;
    }
    
    public static Alumno DatosAlumnos(String Nombre, String Apellidos, String DNI, String Carrera)
    {
        Alumno nuevoAlumno = null;

        if((Nombre != null) && (Apellidos != null) && (DNI != null ) && (Carrera != null) )
        {
            if(!Nombre.isEmpty() && !Apellidos.isEmpty() && !DNI.isEmpty() && !Carrera.isEmpty())
            {
                nuevoAlumno = new Alumno();
            
                nuevoAlumno.setNombre(Nombre);
                nuevoAlumno.setApellido(Apellidos);
                nuevoAlumno.setDNI(DNI);
                nuevoAlumno.setCarrera(Carrera);
            }
        }
        return nuevoAlumno;
    }
    
    public List ListaNumeros (int x)
    {
        List numerosLista = new ArrayList();
        
        for (int i = 0; i < 5; i++) 
        {
            numerosLista.add(x+i);            
        }
        
        Collections.sort(numerosLista);
        
        return numerosLista;
    }
    
    public static int[] Pares(int x)
    {
        int[] par;
        if(x == 0)
        {
            par = null;
            return par;
        }
        par = new int[x];
        int j = 2;       
        for (int i = 0; i < par.length; i++) 
        {
            par[i] = j;
            j+=2;
        }
        return par;
    }
    
    public static double[] Impares(int x)
    {
        double[] impar;
        if(x == 0)
        {
            impar = null;
            return impar;
        }
        impar = new double[x];
        double j = 1.0;
        for (int i = 0; i < x; i++) 
        {
            impar[i] = j;
            j += 2;            
        }
        return impar;
    }
    public String FraseIgual(String text1, String text2)
    {
        String rpta = "";
        if(text1.equals(text2))
        {
            rpta = "Igual";
        }
        else
        {
            rpta = "Diferente";
        }
        return rpta;
    }
    /*public static void main(String[] args) 
    {
        
        //*********************
        float div;
        div = Division(100,4);
        System.out.println("Division: " + div);
        
        //********************
        String text;
        text = Frase("La nieve es blanca");
        System.out.println("La frase sin espacios: "+ text);

        //********************

        Alumno nuevoAlumno = new Alumno();
        
        nuevoAlumno = DatosAlumnos("Midori", "Guerrero", "75016248", "SISTEMAS");
        
        System.out.println("Los datos del nuevo alumno son: \n");
        System.out.println("Nombre: "+nuevoAlumno.getNombre());
        System.out.println("Apellidos: "+nuevoAlumno.getApellido());
        System.out.println("DNI: "+nuevoAlumno.getDNI());
        System.out.println("Carrera: "+nuevoAlumno.getCarrera());
        System.out.println("Edad: "+nuevoAlumno.getEdad());
        
        //********************
        System.out.println("Los numeros son : " + ListaNumeros(5));
        
        //********************
        String test = FraseIgual("Hola", "Mundo");
        System.out.println(test);
        
        //********************
        int[] rpta = Pares(5);
        for (int i = 0; i < rpta.length; i++) 
        {
            System.out.println(rpta[i]);
        }
        
        double[] x = Impares(5);
        for (int i = 0; i < x.length; i++) 
        {
            System.out.println(x[i]);
        }
    }*/
}