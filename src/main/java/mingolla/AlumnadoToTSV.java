/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mingolla;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author pablo
 */
public class AlumnadoToTSV {
    //crearía el archivo y escribiría en él si funionara el ejercicio 1
    public static void crearAlumnoToTSV(Alumnado a, Map<String,String> mapa){
        try(BufferedWriter flujo = new BufferedWriter(new FileWriter("./alumnado/"+obtenerNombre(a.getNombre())+".tsv"))){
            for (Map.Entry<String, String> entry : mapa.entrySet()) {
                flujo.write(entry.getKey()+":"+entry.getValue());
                flujo.newLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    //corrige el nombre para crear el nombre del archivo
    private static String obtenerNombre(String nombre){
        String salida = nombre.replace(" ", "");
        salida=salida.replace(",", "");
        return salida;
    }
}
