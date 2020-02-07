/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto20200207;

import java.util.ArrayList;

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
            {0,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,1}
        };
        String esperado = "1  2  3  /n";
        RompeCabezas rompeCabezas = new RompeCabezas(matriz);
        String imprimible = rompeCabezas.generarImprimible();  
        System.out.println(imprimible); 
        
        boolean res = rompeCabezas.verificarMatrisCuadrada();
        System.out.println("matriz cuadrada : "+ res);
        
        rompeCabezas.obtenerPosicionHueco();
        ArrayList<Posicion> movimientos = rompeCabezas.generarPosiblesMovimientosHueco();
         System.out.println("fila hueco :" + rompeCabezas.hueco.posicion.fila + " columna hueco: "+ rompeCabezas.hueco.posicion.columna);
        for(int i = 0;i<movimientos.size();i++)
        {
            System.out.println("fila :" + movimientos.get(i).fila + " columna: "+movimientos.get(i).columna);
        }

    }
    
}
