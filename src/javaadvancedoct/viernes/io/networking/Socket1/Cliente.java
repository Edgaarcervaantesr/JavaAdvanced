
package javaadvancedoct.viernes.io.networking.Socket1;

import java.net.Socket;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;

public class Cliente {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 3000);
            DataOutputStream dot =
                    new DataOutputStream(s.getOutputStream());
            dot.writeUTF("Hola Servidor");
            dot.flush();
            dot.close();
            s.close();                   
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    
    
}
