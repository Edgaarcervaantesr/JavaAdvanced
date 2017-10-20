package javaadvancedoct.viernes.io.Socket3;


import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;


public class DReciever {
    public static void main(String[] args) throws IOException{
        DatagramSocket ds = new DatagramSocket(3000);
        System.out.print("Servidor");
        byte []b = new byte[1024]; // 1kb
        DatagramPacket dp = new DatagramPacket(b, 1024);
        
        ds.receive(dp);
        String str = new String(dp.getData(),0,dp.getLength());
        System.out.println(str);
        ds.close();
    }
}