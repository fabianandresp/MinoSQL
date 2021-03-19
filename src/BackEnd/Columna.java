/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

/**
 *
 * @author pimie
 */
public class Columna {
    
    String Nombre;
    int columna_ID;

    public Columna(String Nombre, int columna_ID) {
        this.Nombre = Nombre;
        this.columna_ID = columna_ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getColumna_ID() {
        return columna_ID;
    }

    public void setColumna_ID(int columna_ID) {
        this.columna_ID = columna_ID;
    }
    
    
    
}
