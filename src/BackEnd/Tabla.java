 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import FrontEnd.NuevaTabla;
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

    public Tabla() {}
    
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

    public void setColumnas(ArrayList<Columna> columnas) {
        this.columnas = columnas;
    }

    public int getTabla_ID() {
        return tabla_ID;
    }

    public void setTabla_ID(int tabla_ID) {
        this.tabla_ID = tabla_ID;
    }
    
    public void clonarColumnas(){
        NuevaTabla prueba = new  NuevaTabla();
        
        this.columnas = (ArrayList<Columna>) prueba.titulosColumnas.clone();
    }
    
    @Override
    public String toString() {
        return  nombre ;
    }    
    
}
