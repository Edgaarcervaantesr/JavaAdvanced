
package Concierto;

public class Miconcierto {
    
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
    
    public boolean setNombreArtista(String NombreArtista){
        if(!this.NombreArtista.isEmpty())
        {
            return true;
        }
        else
            return false;
    }
    
    public boolean setEdad(int Edad){
        if(Edad > 0){
            return true;
        }
        else
            return false;
    }
    
    public boolean setSexo(String Sexo){
        if(!Sexo.isEmpty()){
            return true;
        }
        else
            return false;
    }
    
    public boolean setGenero(String Genero){
        if(!Genero.isEmpty()){
            return true;
        }
        else
            return false;
    } 
}

