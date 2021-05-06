/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mingolla;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class LecturaCSV {
    public static Map<String,String> leerCSV(String nombre, String ruta){
        Map<String,String> mapa = new HashMap<>();
        String linea;
        String[] tokens;
        try(Scanner sc = new Scanner(new File(ruta+nombre), "UTF-8")){
            sc.nextLine();
            while(sc.hasNext()){
                linea=sc.nextLine();
                tokens=linea.split(";");
                mapa.put(tokens[0], tokens[1]);
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return mapa;
    }
}
