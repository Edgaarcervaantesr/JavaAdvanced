
package javaadvancedoct.Martes.jerarquica;

class Animal{
    void comer(){
        System.out.println("Comiendo...");
    }
}
class Gato extends Animal{
    void maullar(){
        System.out.println("maullando...");
    }
}
public class PruebaHerencia {
    public static void main(String[] args) {
        Gato g= new Gato();
        g.maullar();
        g.comer();
    }
    
}
