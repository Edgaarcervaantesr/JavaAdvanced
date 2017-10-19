
package javaadvancedoct.Miercoles;

abstract class Bike5{
    Bike5(){
        System.out.println("La Bicicleta se a creado");
    }
    abstract void run();
    void changeColor(){
        System.out.println("Color Cambiado");
    }    
}
class Honda2 extends Bike5{
    void run(){
        System.out.println("Corriendo");
    }
}
public class Test2 {
    public static void main(String[] args) {
        Bike5 ob = new Honda2();
        ob.run();
        ob.changeColor();
    }
    
}
