package javaadvancedoct.viernes.io.networking;

import java.io.Exception;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test3 {

    public static void main(String[] args) throws IOException {
        
        try {
            URL url = new URL("http://www.google.com");
            HttpURLConnection huc = (HttpURLConnection) 
                    url.openConnection();
            for (int i = 1; i <= 8; i++) {
                System.out.println(huc.getHeaderFieldKey(i)
                        + " = " + huc.getHeaderField(i));
            }
        } catch (MalformedURLException ex) {
           ex.printStackTrace();
        }
        
    }
}
