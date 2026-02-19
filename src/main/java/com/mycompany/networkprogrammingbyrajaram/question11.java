
package com.mycompany.networkprogrammingbyrajaram;
import java.net.*;
        
public class question11 {
    public static void main(String[] args) throws Exception{
          URL url = new URL("https://www.google.com:443/index.html?name=test");

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("File: " + url.getFile());
        System.out.println("Query: " + url.getQuery());
    }
}
