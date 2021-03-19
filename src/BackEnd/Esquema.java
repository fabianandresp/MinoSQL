/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.util.ArrayList;


public class Esquema {

    String nombre;
    Integer esquema_ID;
    ArrayList <Tabla> tablas = new ArrayList<>();
    

   

    public Esquema( Integer esquema_ID,String nombre) {
        this.nombre = nombre;
        this.esquema_ID = esquema_ID;
    }

    public Esquema() {
       
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

    public Integer getEsquema_ID() {
        return esquema_ID;
    }

    public ArrayList<Tabla> getTablas() {
        return tablas;
    }
    public void eliminarTabla(){
        tablas.clear();
    }

    @Override
    public String toString() {
        return   nombre ;
    }
    
    
    
}
