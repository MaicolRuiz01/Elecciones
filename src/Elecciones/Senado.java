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
public class Senado extends Candidato {

    private Integer numero;

    public Senado(Integer numero, String nombre, String id, String email, char genero, String telefono, PartidoPolitico partido) {
        super(nombre, id, email, genero, telefono, partido);
        this.numero = numero;
    }

    public void validarNumero() {
        if (numero > 0 && numero <= 100) {
            System.out.println("NUMERO VALIDO");
        } else {
            System.out.println("NUMERO NO VALIDO ");
        }
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

    public PartidoPolitico getPartido() {
        return partido;
    }

    public void setPartido(PartidoPolitico partido) {
        this.partido = partido;
    }

    public void imprimir() {
        System.out.println("_____________________________________________________________");
        System.out.println(" SENADOR");
        System.out.println("Partido Politico: " + partido.getNombre());
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + id);
        System.out.println("Email: " + email);
        System.out.println("Votos: " + votosC);
        System.out.println("_____________________________________________________________");

    }

}
