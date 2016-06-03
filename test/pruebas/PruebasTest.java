/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Lector.Lector;
import Alumno.Alumno;
import pruebas.Pruebas;

import org.junit.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Midori
 */
public class PruebasTest {
    
    public PruebasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Division method, of class Pruebas.
     */
    
    
      @Test
    public void TestDivIgual() {
        
        
        Pruebas p= new Pruebas();
        

        
         Assert.assertEquals(p.Division(Float.parseFloat(Lector.leer("testDivIgual", "valor1")),
                Float.parseFloat(Lector.leer("testDivIgual", "valor2"))),Float.parseFloat(Lector.leer("testDivIgual", "esperado")),0);
        
               
    }
   
   
      @Test
    public void TestDivDiferente() {
        
        
        Pruebas p= new Pruebas();
        

       
        
         Assert.assertNotEquals(p.Division(Integer.parseInt(Lector.leer("testDivDiferente", "valor1")),
                Integer.parseInt(Lector.leer("testDivDiferente", "valor2"))),Integer.parseInt(Lector.leer("testDivDiferente", "esperado")));
        
               
    }
   
         @Test
    public void probarSumaIguales() {
        
        
        Pruebas p= new Pruebas();
        
System.out.println(""+ Lector.leer("testSumaIgual", "valor2"));
       
        
         Assert.assertEquals(p.suma(Integer.parseInt(Lector.leer("testSumaIgual", "valor1")),
                Integer.parseInt(Lector.leer("testSumaIgual", "valor2"))),Integer.parseInt(Lector.leer("testSumaIgual", "esperado")));
        
               
    }
   
    
      @Test
    public void probarSumaDiferentes() {
        
        Pruebas p= new Pruebas();
        
       
        
         Assert.assertNotEquals(p.suma(Integer.parseInt(Lector.leer("testSumaDiferentes", "valor1")),
                Integer.parseInt(Lector.leer("testSumaDiferentes", "valor2"))),Integer.parseInt(Lector.leer("testSumaDiferentes", "esperado")));
        
        
               
    }
    
    

    /**
     * Test of Frase method, of class Pruebas.
     */
//    @Test
//    public void testFrase() {
//        System.out.println("Frase");
//        String Texto = "";
//        String expResult = "";
//        String result = Pruebas.Frase(Texto);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of DatosAlumnos method, of class Pruebas.
     */
    @Test
    public void testDatosAlumnos() {
        System.out.println("Datos Alumnos");
        String Nombre = "";
        String Apellidos = "";
        String DNI = "";
        String Carrera = "";
        Alumno result = Pruebas.DatosAlumnos(Nombre, Apellidos, DNI, Carrera);
        assertNull(result);
    }

    /**
     * Test of ListaNumeros method, of class Pruebas.
     */
//    @Test
//    public void testListaNumeros() {
//        System.out.println("ListaNumeros");
//        int x = 0;
//        List expResult = null;
//        List result = Pruebas.ListaNumeros(x);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of FraseIgual method, of class Pruebas.
     */
  
    
    @Test
    public void testFraseIgual() {
   
         Pruebas p= new Pruebas();
        
         Assert.assertEquals(p.FraseIgual(String.valueOf(Lector.leer("testFraseIgual", "text1")), String.valueOf(Lector.leer("testFraseIgual", "text2"))),
                 Lector.leer("testFraseIgual", "esperado"));
    }    
    
    
    @Test
    public void testFraseDiferente() {
        Pruebas p= new Pruebas();
        
         Assert.assertNotEquals(p.FraseIgual(String.valueOf(Lector.leer("testFraseDiferente", "text1")), String.valueOf(Lector.leer("testFraseDiferente", "text2"))),
                 Lector.leer("testFraseDiferente", "esperado"));
    }
    /**
     * Test of Pares method, of class Pruebas.
     */
    @Test
    public void testPares() {
        System.out.println("Pares");
        int x = 5;
        int[] expResult = {2,4,6,8,10};
        int[] result = Pruebas.Pares(x);
        assertArrayEquals(expResult, result);
    }

     @Test (expected = ArithmeticException.class)
    public void DivExcepcion() {
       int i=1/0;
    }
    /**
     * Test of EsPar method, of class Pruebas.
     */
    @Test
    public void testEsPar() {
        System.out.println("EsPar");
        int n1 = 4;
        //boolean expResult = false;
        boolean result = Pruebas.EsPar(n1);
        //assertEquals(expResult, result);
        assertTrue(result);
    }

    /**
     * Test of Impares method, of class Pruebas.
     */
    @Test
    public void testImpares() {
        System.out.println("Impares");
        int x = 0;
        double[] expResult = null;
        double[] result = Pruebas.Impares(x);
        assertArrayEquals(expResult, result,0);
    }
    
   
}