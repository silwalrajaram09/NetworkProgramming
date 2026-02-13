
package com.mycompany.networkprogrammingbyrajaram;
import java.net.*;
import java.util.*;

public class question5 {
    public static void main(String[] args) throws Exception{
        Enumeration<NetworkInterface> interfaces= NetworkInterface.getNetworkInterfaces();
        while(interfaces.hasMoreElements()){
            NetworkInterface ni= interfaces.nextElement();
            System.out.println("Interface name: "+ni.getName());
            System.out.println("display name: "+ni.getDisplayName());
            System.out.println("\n");
            
        }
    }
    
}
