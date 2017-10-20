
/*
Connection - orient: TCP
Connection - Less: UDP

Socket: Es un endpoint entre 2 vias de comunicacion
un socket es usado para la comunicacion entre aplicacion
que poseen diferentes JRE

Java Sockets pueden ser usados para la connection oriented
y oriented-less

conenection - orientes: Socket y ServerSocket
Connection - Less

*/

package javaadvancedoct.viernes.io.networking;

import java.io.IOException;
import java.net.URL;


public class Test {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://www.coppel.com");
            System.out.println("Protocolo: "+url.getProtocol());
            System.out.println("Host Name:" +url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("File Name: "+url.getFile());
            
        }catch(IOException ioe){
            ioe.getStackTrace();
        }
    }
    
}
