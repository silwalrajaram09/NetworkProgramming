
package com.mycompany.networkprogrammingbyrajaram;
import java.net.*;
public class question4 {
    public static void main(String[] args) {
        try{
            
        
        InetAddress ip = InetAddress.getLocalHost();
        String sip= ip.getHostAddress();
        System.out.println("My address is "+sip);
        byte[] address= ip.getAddress();
        if(address.length==4){
            System.out.println("The address is ipv4 ");
        }
        else if(address.length==16){
            System.out.println("The address is ipv4 ");
        } 
    }catch(UnknownHostException ex){
            System.out.println("Sorry i didnt find your address"+ ex);
        }
        
        
        
    }
    
}
