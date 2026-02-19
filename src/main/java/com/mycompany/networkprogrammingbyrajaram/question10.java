
package com.mycompany.networkprogrammingbyrajaram;
import java.net.*;
import java.io.*;
public class question10 {
    public static void main(String[] args) throws Exception{
          URL url = new URL("https://www.google.com");

        BufferedReader br = new BufferedReader(
                new InputStreamReader(url.openStream()));

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
