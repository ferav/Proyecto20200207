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
public class Hueco {
    private Posicion posicion;
    public Hueco(int fila1, int columna1)
    {
        posicion = new Posicion(fila1, columna1);
        
    }
    public Hueco()
    {
        posicion = new Posicion();
    }
    public Posicion getPosicion()
    {
        return posicion;
    }
    

}
