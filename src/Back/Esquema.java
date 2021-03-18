/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import java.util.ArrayList;


public class Esquema {

    String nombre;
    int esquema_ID;
    ArrayList <Tabla> tablas = new ArrayList<>();
    

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

    public void setEsquema_ID(int esquema_ID) {
        this.esquema_ID = esquema_ID;
    }

    public void setTablas(ArrayList<Tabla> tablas) {
        this.tablas = tablas;
    }

    public int getEsquema_ID() {
        return esquema_ID;
    }

    public ArrayList<Tabla> getTablas() {
        return tablas;
    }

    @Override
    public String toString() {
        return   nombre ;
    }
    
    
    
}
