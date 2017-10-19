
package javaadvancedoct.Martes;

/*
La palabra reservada static es principalmente usada
para la administracion de memmoria.
La palabra static puede referirse a:
1.- Variable
2.- Metodo
3.- Bloque
4.- Clases anidadas

*/

public class Estudiante {
    int matricula;
    String nombre;
    String msg;
    static String escuela="ITL";
    
    Estudiante(int matricula, String nombre){
        this.matricula = matricula;
        this.nombre = nombre;
    }
    
    void display(){ 
        msg+="matricula: "+matricula;
        msg+="\nnombre: "+ nombre;
        msg+="\nescuela: "+ escuela;
        System.out.println(msg);    
}

    public static void main (String[] args){
            Estudiante s1= new Estudiante(111, "David");
            Estudiante s2= new Estudiante(112, "Desiree");

            s1.display();
            s2.display();
        }
}

    
    
    
