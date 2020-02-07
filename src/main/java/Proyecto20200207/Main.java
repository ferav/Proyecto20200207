/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto20200207;

/**
 *
 * @author Administrador
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
        };
        String esperado = "1  2  3  /n";
        RompeCabezas rompeCabezas = new RompeCabezas(matriz);
        String imprimible = rompeCabezas.generarImprimible();  
        System.out.println(imprimible); 
        
        boolean res = rompeCabezas.verificarMatrisCuadrada();
        System.out.println("matriz cuadrada : "+ res);

    }
    
}
