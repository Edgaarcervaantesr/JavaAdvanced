package javaadvancedoct.Jueves.Thread;


public class TestS2 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        
        r.addShutdownHook(new Thread(){
            public void run(){
                System.out.println("Shutdown "
                + "hook task complete");
            }
        });
        
        System.out.println("No main, prees crtl+c to exit");
        try{
            Thread.sleep(4000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
