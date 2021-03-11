/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import Interfaz.Interfaz;
import java.util.HashMap;

/**
 *
 * @author pimie
 */
public class Esquema {
    Interfaz obtener = new Interfaz();
    
    int id;
    String nombre;
    
    HashMap <Integer, String> IdEsquemas = new HashMap<>();
    
    public void asignarId(){
        
        
    }

    public Esquema(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Esquema() {
    }
    
    
    public Esquema(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     
    
    
    
}
