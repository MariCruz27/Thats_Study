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
public class Matricula {

    private int idMatricula;
    private String idMatri;

    public Matricula(int idMatricula, String idGrupo, String idMateria) {
        this.idMatricula = idMatricula;
        this.idMatri = idGrupo+" - "+idMateria;
    }

    public String toString() {
        return idMatri;
    }

    /**
     * @return the idMatricula
     */
    public int getIdMatricula() {
        return idMatricula;
    }

    /**
     * @param idMatricula the idGrupo to set
     */
    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return idMatri;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.idMatri = nombre;
    }
}
