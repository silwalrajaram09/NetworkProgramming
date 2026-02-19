
package com.mycompany.networkprogrammingbyrajaram;

public class question12 {
    public static void main(String[] args) {

        String protocols = System.getProperty("java.protocol.handler.pkgs");

        if (protocols != null)
            System.out.println("Supported Protocol Packages: " + protocols);
        else
            System.out.println("Default protocols supported: HTTP, HTTPS, FTP, FILE, JAR");
    }
    
}
