
package javaadvancedoct.Miercoles;
/*
La abstraccion es un proceso para ocultar los detalles
de implementacion y mostrar solo la funcionalidad al
usuario.

Declaracion: int a;
una clase declarada con la palabra reservada Abstract 
se considera abstracta de nombre
puede ser abstractacon metodos no abstractos

Enviar sms solo escribe el texto y lo envia, no 
conocemos el proceso interno sobre la entrega
de mensajes
Implementacion: 

Formas de lograr la abstraccion
    1.- Clase Abstracta (0 a 100%)
    2.- Interface (100%)

Una clase declarada abstracta necesita ser extendida
(extends) e implementar sus metodos. No se puede 
instanciar. 
    Abstract class A{}
Un metodo declarado abstracto no tiene implementaciones
    abstract void print();
*/

abstract class Bike3{
    abstract void run();
}

public class Abstraccion  extends Bike3 {
    @Override
    void run(){
        System.out.println("Running");
    }
    
    public static void main(String[] args) {
        Bike3 b = new Abstraccion();
        b.run();
    }
}
