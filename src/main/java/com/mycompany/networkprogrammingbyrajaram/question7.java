
package com.mycompany.networkprogrammingbyrajaram;
import java.net.*;
import java.util.*;
public class question7 {
    public static void main(String[] args) throws Exception{
        String interfaceName= "en0";
         NetworkInterface ni = NetworkInterface.getByName(interfaceName);
         if (ni != null) {
            Enumeration<InetAddress> addresses = ni.getInetAddresses();

            while (addresses.hasMoreElements()) {
                InetAddress addr = addresses.nextElement();
                System.out.println("IP Address: " + addr.getHostAddress());
            }
        } else {
            System.out.println("Interface not found.");
        }

    }
    
}
