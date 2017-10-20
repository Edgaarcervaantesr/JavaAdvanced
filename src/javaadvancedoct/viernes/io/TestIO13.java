package javaadvancedoct.viernes.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javafx.scene.paint.Color;

public class TestIO13 {
    public static void main(String[] args) throws IOException{
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        
        FileWriter fr = new FileWriter("C:\\uno.txt");
        BufferedWriter bw = new BufferedWriter(fr);
        
        String  cadena="";
        while(!cadena.equals("stop")){
            cadena = br.readLine();
            bw.write(cadena);
            System.out.println("Cadena: "+cadena);
            
        }
        br.close();
        in.close();
        bw.close();
    }
    
}
