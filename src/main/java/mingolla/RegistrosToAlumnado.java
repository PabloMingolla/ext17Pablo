/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mingolla;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pablo
 */
public class RegistrosToAlumnado{
    public static ArrayList<Alumnado> listarAlumnos(ArrayList<RegistroJSON> listaRegistros){
        ArrayList<Alumnado> listaAlumnos = new ArrayList<>();
        for (RegistroJSON registro : listaRegistros) {
            listaAlumnos.add(new Alumnado(registro.getAlumnoA(),crearMapa(registro)));
        }
        return listaAlumnos;
    }
    private static Map<String,String> crearMapa(RegistroJSON r){
        Map<String,String> salida = new HashMap<>();
        salida.put("OACV", r.getoACV());
        salida.put("EA", r.geteA());
        salida.put("TII", r.gettII());
        salida.put("TC", r.gettC());
        salida.put("ING", r.getiNG());
        salida.put("FOL", r.getfOL());
        salida.put("CEAC", r.getcEAC());
        return salida;
    }
}
