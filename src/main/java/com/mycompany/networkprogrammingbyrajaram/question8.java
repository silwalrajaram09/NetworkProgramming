
package com.mycompany.networkprogrammingbyrajaram;

import java.net.*;
import java.util.*;
public class question8 {
    public static void main(String[] args) throws Exception{
         InetAddress ip = InetAddress.getLocalHost();
        NetworkInterface ni = NetworkInterface.getByInetAddress(ip);

        if (ni != null) {
            byte[] mac = ni.getHardwareAddress();

            if (mac != null) {
                System.out.print("MAC Address: ");
                for (int i = 0; i < mac.length; i++) {
                    System.out.format("%02X%s",
                            mac[i],
                            (i < mac.length - 1) ? "-" : "");
                }
            } else {
                System.out.println("No MAC address available.");
            }
        }
    }
    
}
