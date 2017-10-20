package javaadvancedoct.Jueves;

public class LoadImage extends Thread{
    String imagen;
    public void run(){
        try{
            display("codigo.png");
            System.out.println("Muestra Imagen");
            Thread.sleep(1000);
            
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
    }
    
    public static void display(String imagen){
        //this.imagen = imagen;        
        
        //JFrame f = new JFrame("Load");
        
        
        //f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }             
        });
        
        f.add(new LoadImageApp(imagen));
        f.pack();
        f.setVisible(true);}
    
    public static void main(String[] args) {
        LoadImage t1 = new LoadImage();
        t1.start();
    }
    
}
