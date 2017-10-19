
package javaadvancedoct.Miercoles.interfaces;


public class printable implements print {
    public void print(){
        System.out.println("Hola");
    }
    
    public static void main(String[] args) {
        printable p = new printable();
        p.print();
    }
}
