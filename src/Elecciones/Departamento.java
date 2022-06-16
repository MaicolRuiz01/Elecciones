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
public class Departamento {
    private String nombre;
    private Integer curules;

    public Departamento(String nombre, Integer curules) {
        this.nombre = nombre;
        this.curules = curules;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCurules() {
        return curules;
    }

    public void setCurules(Integer curules) {
        this.curules = curules;
    }
    
    
    
    
    
}
