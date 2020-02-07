/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Proyecto20200207.Posicion;
import Proyecto20200207.RompeCabezas;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class RompeCabezasTest {
    
    public RompeCabezasTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    //Prueba del Objetivo 1
    @Test
    public void testGenerarEstructura()
    {
        
        int[][] matriz ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
        };
        RompeCabezas rompeCabezas = new RompeCabezas(matriz);
        boolean respuesta = rompeCabezas.verificarMatrisCuadrada();
        assertTrue(respuesta == true);
    }
    
    //Prueba del Objetivo 1
    @Test
    public void testMatrisNoTienHueco() {
        
        int[][] matriz ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
        };
        RompeCabezas rompeCabezas = new RompeCabezas(matriz);
        boolean respuesta = rompeCabezas.verificarTieneHueco();
        assertTrue(respuesta == true);
    }
    
    
    //Prueba del Objetivo 1
    @Test
    public void testRompecapezasImprimirMatriz() {
        
        int[][] matriz ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {130,14,15,0}
        };
        String esperado = "1   2   3   4   \n5   6   7   8   \n9   10  11  12  \n130 14  15  0   \n";
        RompeCabezas rompeCabezas = new RompeCabezas(matriz);
        String imprimible = rompeCabezas.generarImprimible();  
        assertTrue(esperado.equals(imprimible));
        System.out.println(imprimible);     
    }
    
    
    //Prueba del Objetivo 2
    @Test
    public void testGenerarPosiblesMovimentosHueco() {
        int[][] matriz ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {130,14,15,0}
        };
        RompeCabezas rompeCabezas = new RompeCabezas(matriz);
        ArrayList res = rompeCabezas.generarPosiblesMovimientosHueco();
        assertTrue(res.isEmpty() == false);     
    }
    
    //Prueba del Objetivo 3
    @Test
    public void testMoverHueco() {
        
        int[][] matriz ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
        };
        String esperado = "1  2  3  4  \n5  6  7  8  \n9  10 11 0  \n13 14 15 12 \n";
        RompeCabezas rompeCabezas = new RompeCabezas(matriz);
        ArrayList<Posicion> res = rompeCabezas.generarPosiblesMovimientosHueco();
        rompeCabezas.moverHueco(res.get(0));
        String imprimible = rompeCabezas.generarImprimible();
        assertTrue(esperado.equals(imprimible));
        System.out.println(imprimible);     
    }


}
