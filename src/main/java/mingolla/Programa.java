/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mingolla;

import java.util.Map;

/**
 *
 * @author pablo
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //prueba ej1
        Map<String,String> mapa = LecturaCSV.leerCSV("nombresModulos.csv", "./");
        System.out.println(mapa.toString());
    }
    
}
