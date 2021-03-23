/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import FrontEnd.MainWindow;
import FrontEnd.NuevaTabla;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pimie
 */
public class Controlador {

    Map<Integer, Esquema> esquemas = new HashMap<>();
    Tabla tablasMain = new Tabla();
    Columna columnasMain = new Columna();

    Integer contador = 1;

    public void iniciar() {

        MainWindow mino_SQL = new MainWindow(this);
        mino_SQL.setVisible(true);
        NuevaTabla nueva = new NuevaTabla(this);
        nueva.setVisible(true);
    }

    public void iniciarVentanaSecundaria() {
        NuevaTabla nueva = new NuevaTabla(this);
        nueva.setVisible(true);
    }

    public void agregarEsquema(Esquema esquema) {

        esquemas.put(contador, esquema);
        contador++;
    }

    public Map<Integer, Esquema> getEsquemas() {
        return esquemas;
    }

    public Esquema getEsquema(Integer id_esquema) {
        return this.esquemas.get(id_esquema);
    }

    public Tabla getTablas() {
        return tablasMain;
    }

    public void setTablas(Tabla tablas) {
        this.tablasMain = tablas;
    }
    
    //Metodo por modificar o Corregir
    public String[] getTablas(Esquema esquema) {
        ArrayList<Tabla> showTablas = new ArrayList<>();
        for (int i = 0; i < esquema.tablas.size(); i++) {
            if (esquema.esquema_ID == esquema.tablas.get(i).tabla_ID) {
                showTablas.add(esquema.getTablas().get(i));
            }
        }
        System.out.println(showTablas.size());
        String[] finalShowTablas = new String[showTablas.size()];
        showTablas.toArray(finalShowTablas);
        System.out.println(finalShowTablas.length);
        return finalShowTablas;
    }
}
