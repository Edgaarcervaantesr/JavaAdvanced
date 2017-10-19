
package javaadvancedoct.Miercoles;

class Shape{
    void draw(){
        System.out.println("Drawing...");
    }
}

class Rectangle{
    void draw(){
        System.out.println("Dibujando un Rectangulo...");
    }
}

class Circle{
    void draw(){
        System.out.println("Dibujando un Circulo...");
    }
}

class Triangle{
    void draw(){
        System.out.println("Dibujando un Triangulo...");
    }
}

public class TestFiguras {
    public static void main(String[] args) {
        Shape s;
        s= new Rectangle();
        s.draw();
        s= new Circle();
        s.draw();
        s= new Triangle();
        s.draw();
    }
    
}
