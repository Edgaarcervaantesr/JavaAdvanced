package javaadvancedoct.carrera;


public class Liebre implements Runnable{
    public void run(){
        int i=0;
        System.out.println("Inicia la liebre");
        
        while(i<5){
            try{
                Thread.sleep(250);
                System.out.println("Da un paso la liebre");
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
            
            i++;
        }
        System.out.println("Termino la liebre");
    }    
}
