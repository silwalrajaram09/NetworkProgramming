
package com.mycompany.networkprogrammingbyrajaram;
import java.net.*;
public class question2 {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("Host name: "+ip.getHostName());
        System.out.println("Address: "+ip.getHostAddress());
        System.out.println("CanonicalHostName "+ip.getCanonicalHostName());
        
        
    }
    
}
