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
public class EleccionesParlamentarias {
    public static void main(String[] args) {
        PartidoPolitico partido1 =new PartidoPolitico("Liberal", 1990);
        
        Senado senador1=new Senado(5,"Petro","60254885", "pretro@gmail.com",'M', "315836210",partido1);
        senador1.validarNumero();
        senador1.votar();
        senador1.votar();
        senador1.imprimir();
        
        Senado senador2=new Senado(6, "uribe", "012", "uribeparaquito@gmail.com", 'M',"555555", partido1);
        senador2.validarNumero();
        senador2.votar();
        senador2.imprimir();
        
        
        
        
        Departamento dp= new Departamento("Norte de santander", 5);
        RepresentanteCamara representante1= new RepresentanteCamara(dp,106,"Jose", "10049255", "Jose123@gmail.com", 'M',"30048755",partido1);
        representante1.validarNumero();
        representante1.votar();
        representante1.votar();
        representante1.votar();
        representante1.votar();
        representante1.imprimir();
        //  
        senador1.porcentajeVotos();
        senador2.porcentajeVotos();
        representante1.porcentajeVotos();
        
    }
    
}
