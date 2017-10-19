package javaadvancedoct.Miercoles;

//Name
public class TestN extends Thread{
    public void run(){
        System.out.println("running");
    }
    public static void main(String[] args) {
        TestN t1 = new TestN();
        TestN t2 = new TestN();
        
        System.out.println("Nombre t1: "+t1.getName());
        System.out.println("Nombre t2: "+t2.getName());
        
        System.out.println("Id t1: "+t1.getId());
        System.out.println("Id t2: "+t2.getId());
        
        System.out.println("Priority t1: "+t1.getPriority());
        System.out.println("Priority t2: "+t2.getPriority());
        
        System.out.println("State t1: "+t1.getState());
        System.out.println("State t2: "+t2.getState());

        // System.out.println("Nombre t1: " Thread.currentThread()instanceof .ge
        //System.out.println("Nombre t2: " Thread.currentThread()getName());
        
        System.out.println("Nombre t1: "+t1.toString());
        System.out.println("Nombre t2: "+t2.toString());
        
        
        t1.start();
        t2.start();
    }

    
}
