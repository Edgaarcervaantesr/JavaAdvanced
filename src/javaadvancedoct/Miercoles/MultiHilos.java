package javaadvancedoct.Miercoles;

public class MultiHilos extends Thread{
    public void run(){
        System.out.println("Corriendo...");
    }
    public void eat(){
        System.out.println("Comiendo...");
    }
    public void sleep(){
        System.out.println("Durmiendo...");
    }
    public void talk(){
        System.out.println("Platicando...");
    }
    
    public static void main(String[] args) {
        MultiHilos t1 = new MultiHilos();
        MultiHilos t2 = new MultiHilos();
        MultiHilos t3 = new MultiHilos();
        MultiHilos t4 = new MultiHilos(); 
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    
}
