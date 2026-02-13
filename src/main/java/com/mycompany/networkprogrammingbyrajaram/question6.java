package com.mycompany.networkprogrammingbyrajaram;

import java.net.*;

public class question6 {
    public static void main(String[] args) throws Exception {

        InetAddress ip = InetAddress.getLocalHost();
        NetworkInterface ni = NetworkInterface.getByInetAddress(ip);

        System.out.println("IP address: " + ip.getHostAddress());

        if (ni != null) {
            byte[] mac = ni.getHardwareAddress();

            if (mac != null) {
                System.out.print("MAC address: ");
                for (int i = 0; i < mac.length; i++) {
                    System.out.format("%02X%s",
                            mac[i],
                            (i < mac.length - 1) ? "-" : "");
                }
            } else {
                System.out.println("No MAC address found (Loopback interface)");
            }
        } else {
            System.out.println("Network Interface not found.");
        }
    }
}
