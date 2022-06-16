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
public class RepresentanteCamara extends Candidato {

    private Departamento departamento;
    private Integer numeros;

    public RepresentanteCamara(Departamento departamento, Integer numeros, String nombre, String id, String email, char genero, String telefono, PartidoPolitico partido) {
        super(nombre, id, email, genero, telefono, partido);
        this.departamento = departamento;
        this.numeros = numeros;
    }

    public boolean validarNumero() {
        if (numeros > 100 && (numeros < departamento.getCurules() + 100)) {
            System.out.println("NUMERO VALIDO ");
            return true;
        } else {
            System.out.println("EL NUMERO NO ES VALIDO");
            return false;
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
        System.out.println("CAMARA DE REPRESENTANTES");
        System.out.println("Partido Politico: " + partido.getNombre());
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + id);
        System.out.println("Email: " + email);
        System.out.println("Votos: " + votosC);
        System.out.println("_____________________________________________________________");

    }

}
