package com.mycompany.networkprogrammingbyrajaram;

import java.net.*;
public class question1 {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("host name: "+ip.getHostName());
        System.out.println("ip address: "+ip.getHostAddress());
        
    }
    
}
