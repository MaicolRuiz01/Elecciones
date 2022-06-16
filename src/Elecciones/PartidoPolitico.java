/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elecciones;

/**
 *
 * @author 57310
 */
public class PartidoPolitico {

    private String nombre;
    private int anioCreacion;

    public PartidoPolitico(String nombre, int anioCreacion) {
        this.nombre = nombre;
        this.anioCreacion = anioCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

}
