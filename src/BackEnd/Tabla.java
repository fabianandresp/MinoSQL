/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.util.ArrayList;

/**
 *
 * @author pimie
 */
public class Tabla {
    ArrayList <Columna> columnas = new ArrayList<>();
    String nombre; 
    int tabla_ID;
  
   
    //Crear ArrayList de las columnas

//    public Tabla() {}
    
    public Tabla( int tabla_ID, String nombre) {
        this.nombre = nombre;
        this.tabla_ID = tabla_ID;
      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Columna> getColumnas() {
        return columnas;
    }
    
  
    @Override
    public String toString() {
        return  nombre ;
    }

//    public int getTamTablas() {
//        return tamTablas;
//    }
//
//    public void setTamTablas(int tamTablas) {
//        this.tamTablas = tamTablas;
//    }
//    
    
}
