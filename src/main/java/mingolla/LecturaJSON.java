/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mingolla;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class LecturaJSON {

    //lectura del Fichero JSON a través del mapper
    public static ArrayList<RegistroJSON> leerFicheroJSON(String nombre, String ruta) {
        ArrayList<RegistroJSON> lista = new ArrayList<>();
        try {
            ObjectMapper mapeador = new ObjectMapper();
            lista = mapeador.readValue(new File(ruta+nombre), mapeador.getTypeFactory().constructCollectionLikeType(ArrayList.class, RegistroJSON.class));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
