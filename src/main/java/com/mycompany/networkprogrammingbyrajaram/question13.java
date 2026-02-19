
package com.mycompany.networkprogrammingbyrajaram;
import java.net.URI;
public class question13 {
    public static void main(String[] args) throws Exception{
         URI uri = new URI("https://www.ram.com:8080/index.html?name=rajaram#section1");

        System.out.println("Scheme: " + uri.getScheme());
        System.out.println("Host: " + uri.getHost());
        System.out.println("Port: " + uri.getPort());
        System.out.println("Path: " + uri.getPath());
        System.out.println("Query: " + uri.getQuery());
        System.out.println("Fragment: " + uri.getFragment());
    }
    
}
