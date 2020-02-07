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
public class Posicion {
    int fila;
    int columna;
    
    Posicion(int fila, int columna)
    {
        this.fila = fila;
        this.columna = columna;
    }
    Posicion()
    {
    }
    public int getFila()
    {
        return fila;
    }
    public int getColumna()
    {
        return columna;
    }
    public void setFila(int nuevaFila)
    {
        fila = nuevaFila;
    }
    public void setColumna(int nuevaColumna)
    {
        columna = nuevaColumna;
    }
}
