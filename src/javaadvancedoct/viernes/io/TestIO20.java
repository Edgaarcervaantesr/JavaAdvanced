package javaadvancedoct.viernes.io;

import java.io.IOException;
import java.io.CharArrayWriter;
import java.io.FileWriter;


public class TestIO20 {
    public static void main(String[] args) throws IOException{
        CharArrayWriter out = new CharArrayWriter();
        
        out.write("Hola Coppel");
        
        FileWriter f1 = new FileWriter("C:\\a.txt");
        FileWriter f2 = new FileWriter("C:\\b.txt");
        FileWriter f3 = new FileWriter("C:\\c.txt");
        FileWriter f4 = new FileWriter("C:\\d.txt");
        
        WriteToFile(out, f1, f2, f3, f4);        
        CloseStreams(f1, f2, f3, f4);
        System.out.println("Listo");
        
    }

    private static void WriteToFile(CharArrayWriter out, FileWriter f1, FileWriter f2, FileWriter f3, FileWriter f4) throws IOException {
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
    }

    private static void CloseStreams(FileWriter f1, FileWriter f2, FileWriter f3, FileWriter f4) throws IOException {
        f1.close();
        f2.close();
        f3.close();
        f4.close();
    }
    
}
