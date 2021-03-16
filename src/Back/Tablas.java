/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

/**
 *
 * @author pimie
 */
public class Tablas {
    
    String nombre; 
    int numColumnas;

    public Tablas() {}
    
    public Tablas(String nombre, int numColumnas) {
        this.nombre = nombre;
        this.numColumnas = numColumnas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumColumnas() {
        return numColumnas;
    }

    public void setNumColumnas(int numColumnas) {
        this.numColumnas = numColumnas;
    }

    @Override
    public String toString() {
        return  nombre + "." + numColumnas;
    }
    
    
}
