/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Administrador
 */
public class Partido {
    private int fecha;
    private String equipo1;
    private int goles1;
    private String equipo2;
    private int goles2;

    public Partido() {
    }

    public Partido(int fecha, String equipo1, int goles1, String equipo2, int goles2) {
        this.fecha = fecha;
        this.equipo1 = equipo1;
        this.goles1 = goles1;
        this.equipo2 = equipo2;
        this.goles2 = goles2;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public int getGoles1() {
        return goles1;
    }

    public void setGoles1(int goles1) {
        this.goles1 = goles1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGoles2() {
        return goles2;
    }

    public void setGoles2(int goles2) {
        this.goles2 = goles2;
    }
    
}
