
package javaadvancedoct.Miercoles;

abstract class Shape2{
    abstract void draw();
}

class Rectangle2 extends Shape2{
    void draw(){
        System.out.println("Drawing a rectangle");
    }
}
class Circle2 extends Shape2{
    void draw(){
        System.out.println("Drawing a circle");
    }
}
public class Figuras2 {
    public static void main(String[] args) {
        Shape2 s = new Circle2();
        s.draw();
    }
}
