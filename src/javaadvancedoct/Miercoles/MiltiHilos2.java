
package javaadvancedoct.Miercoles;


public class MiltiHilos2 implements Runnable{
    public  void run(){
        System.out.println("Corriendo");
    }
    public static void main(String[] args) {
        MiltiHilos2 m2 = new MiltiHilos2();
        Thread t2 = new Thread(m2);
        t2.start();
    }
}
