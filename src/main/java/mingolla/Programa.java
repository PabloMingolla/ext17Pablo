/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mingolla;

import java.util.ArrayList;
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
        //Map<String,String> mapa = LecturaCSV.leerCSV("nombresModulos.csv", "");
        //System.out.println(mapa.toString());
        
        //prueba ej2
        ArrayList<RegistroJSON> listaEj2 = LecturaJSON.leerFicheroJSON("calificacionesGrupo.json", "./");
        for (RegistroJSON registro : listaEj2) {
            System.out.println(registro.toString());
        }
        
        //prueba ej3
        ArrayList<Alumnado> listaEj3 = RegistrosToAlumnado.listarAlumnos(listaEj2);
        for (Alumnado alumnado : listaEj3) {
            System.out.println(alumnado.toString());
        }
    }
    
}
