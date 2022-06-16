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
public class Candidato {

    protected String nombre;
    protected String id;
    protected String email;
    protected char genero;
    protected String telefono;

    protected static Integer votos = 0;
    protected Integer votosC = 0;
    protected PartidoPolitico partido;

    public Candidato(String nombre, String id, String email, char genero, String telefono, PartidoPolitico partido) {
        this.nombre = nombre;
        this.id = id;
        this.email = email;
        this.genero = genero;
        this.telefono = telefono;

        this.partido = partido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static Integer getVotos() {
        return votos;
    }

    public static void setVotos(Integer votos) {
        Candidato.votos = votos;
    }

    public Integer getVotosC() {
        return votosC;
    }

    public void setVotosC(Integer votosC) {
        this.votosC = votosC;
    }

    public void votar() {
        votos++;
        votosC++;
    }

    public static void totalVotos() {
        System.out.println("Total votos: " + votos);
    }
    public  void porcentajeVotos(){
        Double por=Double.valueOf(votosC*100/votos);
        
        System.out.println("Candidato: "+nombre+" obtuvo un Porcentaje: "+por+"% de los votos ");
    }

}
