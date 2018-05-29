/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author Administrador
 */
@Local
public interface FechasLocal {

    ArrayList guardaPartidos(int fecha, String equipo1, int goles1, String equipo2, int goles2);
    
}
