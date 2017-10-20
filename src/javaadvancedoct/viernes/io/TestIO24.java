package javaadvancedoct.viernes.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//serialozamos
public class TestIO24 implements Serializable{
    int id;
    String nameClass;
    public TestIO24(int id, String nameClass){    
    this.id = id;
    this.nameClass = nameClass;
    }
}

class Test{
    public static void main(String[] args) throws  IOException{
        TestIO24 t = new TestIO24(24,"TestIO24");
        
        FileOutputStream fout = new FileOutputStream("C:\\t.txt");
        
        ObjectOutputStream out = new ObjectOutputStream(fout);
        
        out.writeObject(t);
        out.flush();
        System.out.println("Listo");
    }
}