package javaadvancedoct.Jueves.io;

import java.io.Console;
import java.io.IOException;

public class TestIO12 {
    public static void main(String[] args) throws IOException{
        Console c = System.console();
        System.out.println("Introduce tu nombre: ");
        String n = c.readLine();
        System.out.println("Bienvenido"+n);
    }
}
