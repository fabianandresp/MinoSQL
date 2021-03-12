/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import Interfaz.Interfaz;
import java.util.HashMap;
import static jdk.nashorn.internal.runtime.Debug.id;

//NO TOMAR EN CUENTA AUN!!

public class Esquema {

    Interfaz obtener = new Interfaz();

    Integer cont = 0;
    String nombre;

    HashMap<Integer, Esquema> id = new HashMap<>();

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

}
