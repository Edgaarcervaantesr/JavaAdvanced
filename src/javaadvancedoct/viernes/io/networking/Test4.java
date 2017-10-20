
package javaadvancedoct.viernes.io.networking;

import java.net.InetAddress;


public class Test4 {
    public static void main(String[] args) {
        try{
            InetAddress ip =
                    InetAddress.getByName("www.oracle.com");
            System.out.println("Nombre del host: "+ip.getHostName());
            System.out.println("Direccion ip: "+ip.getHostAddress());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
