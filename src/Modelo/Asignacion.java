/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author User
 */
public class Asignacion {

    private int idAsig;
    private String nombre;

    public Asignacion(int idAsig, String nombre) {
        this.idAsig = idAsig;
        this.nombre = nombre;
    }

    public String toString() {
        return nombre;
    }

    /**
     * @return the idDocente
     */
    public int getIdAsig() {
        return idAsig;
    }

    /**
     * @param idAsig the idAsig to set
     */
    public void setIdAsig(int idAsig) {
        this.idAsig = idAsig;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
