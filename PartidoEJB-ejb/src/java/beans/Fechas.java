/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import clases.Partido;
import java.util.ArrayList;
import javax.ejb.Singleton;

/**
 *
 * @author Administrador
 */
@Singleton
public class Fechas implements FechasLocal {
    ArrayList<Partido> lista = new ArrayList<>();

    @Override
    public ArrayList guardaPartidos(int fecha, String equipo1, int goles1, String equipo2, int goles2) {
        Partido p = new Partido();
        p.setFecha(fecha);
        p.setEquipo1(equipo1);
        p.setGoles1(goles1);
        p.setEquipo2(equipo2);
        p.setGoles2(goles2);
        lista.add(p);
        return lista;
    }
    
}
