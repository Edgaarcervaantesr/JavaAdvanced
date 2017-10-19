package javaadvancedoct.Miercoles;
//Sleep

public class NuevoTest extends Thread{
    public void run(){
        for(int i = 1; i<5; i++){
            try{
                Thread.sleep(500);
                System.out.println(i);                
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
    
    public static void main(String[] args) {
        NuevoTest t1 = new NuevoTest(), t2 = new NuevoTest();
      //  t1.start();
        //t2.start();
        t1.start();
        t2.start();
    }
}
