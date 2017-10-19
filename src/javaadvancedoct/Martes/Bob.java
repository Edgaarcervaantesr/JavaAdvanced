
package javaadvancedoct.Martes;

/*
Contructor: Artefacto utilizado para inicializar los objetos
Es un conjunto de instrucciones diseñado para inicializar
una instancia de una clase
en su declaracion o encabezado puede aceptar parametros

Bob b = new Bob();
Bob() <- Hace referencia al contructor por omision

Antes de su ejecucion, bob, es null; al ginal de la llamada "Bob"
es un apuntador al objeto (referencia) con espacio reservado 
en RAM para contener sus valores de atributos y sus apuntadores a 
metodos.

¿Por que el contructor no es un metodo?
No se puede llamar al contructor usando el operador de indireccion
Carece de un valor de retorno distinto a un apuntador
no puede ser DEFEFINIDO()
No puede ser declarado con un TYPE

*/
public class Bob {
Bob(){
    System.out.println("Soy bob el contructor");
    }    
}
