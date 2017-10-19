/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvancedoct.Martes;


public class Concierto {
    
    private String NombreArtista, Sexo, Genero;
    private int Edad;
        
    public String getNombreArtista(){
        return NombreArtista;
    }
    
    public int getEdad(){
        return Edad;
    }
    
    public String getSexo(){
        return Sexo;
    }
    
    public String getGenero(){
        return Genero;
    }
    
    public Concierto(){
    }
    public Concierto(String NombreArtista, String Sexo, String Genero){
    this.NombreArtista = NombreArtista;
    this.Sexo = Sexo;
    this.Genero = Genero;
    }
}


