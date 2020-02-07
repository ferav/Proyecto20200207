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
public class RompeCabezas {
    int[][] matriz;
    Hueco hueco;
    
    public RompeCabezas(int[][] matriz)
    {
        this.matriz = matriz;
        hueco = new Hueco();
    }
    
    
    public boolean verificarMatrisCuadrada()
    {
        boolean res = true;
        for (int x = 0; x < matriz.length; x++) 
        {
            if(matriz[x].length != matriz.length)
            {
                res = false;
                break;
            }
        }
        return res;
    }
    
    public boolean verificarTieneHueco()
    {
        boolean res = false;
        int contador = 0;
        for (int x = 0; x < matriz.length; x++) 
        {
            for (int y = 0; y < matriz[x].length; y++) 
            {
                if( matriz[x][y] == 0)
                {
                    contador = contador + 1;
                }
            }
            
        }
        if(contador == 1)
            res = true;
        return res;
    }
    
    public String generarImprimible()
    {
        String res = "";
        for (int x = 0; x < matriz.length; x++) 
        {
            for (int y = 0; y < matriz[x].length; y++) 
            {
                res = res + matriz[x][y] + generarEspcios(matriz[x][y]);
                
            }
            res = res + "\n";
        }
        return res;
        
    }
    public String generarEspcios(int numero)
    {
        String res = "";
        int cantDigitosMax = cantidadDigitos(obtenerMaximoNumero());
        int cantDigitosNumero = cantidadDigitos(numero);
        int numeroEspacios = (cantDigitosMax + 1) - cantDigitosNumero;
        while(numeroEspacios != 0)
        {
            res = res + " ";
            numeroEspacios--;
        }
                
        return res;
    }
    public int obtenerMaximoNumero()
    {
        
        int res = matriz[0][0];
        for (int x = 0; x < matriz.length; x++) 
        {
            for (int y = 0; y < matriz[x].length; y++) 
            {
                if( matriz[x][y] > res)
                {
                    res = matriz[x][y];
                }
            }
        }
        return res;
    }
    
    public int cantidadDigitos(int numero)
    {
        int res = 0;
        int cociente = numero;
        do
        {
            cociente = cociente / 10;
            res = res + 1;
            
        }
        while(cociente != 0);
        return res;
    }
    public void generarPosicionHueco(int fila, int columna)
    {
        
        for (int x = 0; x < matriz.length; x++) 
        {
            for (int y = 0; y < matriz[x].length; y++) 
            {
                if(matriz[x][y] == 0)
                {
                    hueco.fila = x;
                    hueco.columna = y;
                }
            }
            
        }
        
    }

}
