
package javaadvancedoct.Martes;


public class Empleado {
    
    float salario = 40000;
    
}

public class Programador extends Empleado{
    int bono = 10000;
    public static void main(string[] args){
        String msg="";
        Programador p = new Programador();
        msg+="El salario del programador es ";
        System.out.println(msg);
        System.out.println("El bono es: "+p.bono);
    }

}
