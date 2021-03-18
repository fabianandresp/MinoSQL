/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

import Interfaz.Interfaz;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pimie
 */
public class Controlador {

    Map<Integer, Esquema> esquemas = new HashMap<>();

    public void iniciar() {

        Interfaz mino_SQL = new Interfaz(this);
        mino_SQL.setVisible(true);

    }
    public void agregarEsquema(Esquema esquema){
        
    }

    public Map<Integer, Esquema> getEsquemas() {
        return esquemas;
    }
    
    public Esquema getEsquema(Integer id_esquema){
        return this.esquemas.get(id_esquema);
    }
    
}
