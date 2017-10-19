package javaadvancedoct.Martes.banco;

class intereses{
    void SBI(){
        System.out.println("Interes del 10%");
    }
    void ICICI(){
        System.out.println("Interes del 15%");
    }
    void AXIS(){
        System.out.println("Interes del 20%");
    }
    
}

public class Banco1 extends intereses{
    public static void main(String[] args) {
        intereses banco = new intereses();
        banco.SBI();        
        banco.ICICI();
        banco.AXIS();        
    }
            
    
}
