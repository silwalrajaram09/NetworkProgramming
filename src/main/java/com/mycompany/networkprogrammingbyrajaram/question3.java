
package com.mycompany.networkprogrammingbyrajaram;
import java.net.*;

public class question3 {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress ip= InetAddress.getLocalHost();
        //characteristics of othe ip address is loopback,multicast, site local  and any local
        System.out.println("is Multicast: "+ip.isMulticastAddress());
        System.out.println("is loopcast: "+ip.isLoopbackAddress());
        System.out.println("is site local: "+ip.isSiteLocalAddress());
        System.out.println("is any local: "+ip.isAnyLocalAddress());
        System.out.println("is link local: "+ ip.isLinkLocalAddress());
         System.out.println("is mc global: "+ip.isMCGlobal());
        System.out.println("is mc link global: "+ip.isMCLinkLocal());
        System.out.println("is mc site  local: "+ip.isMCSiteLocal());
        System.out.println("is mc node local: "+ip.isMCNodeLocal());
        System.out.println("is mc org local: "+ ip.isMCOrgLocal());
        
        
        
    }
    
}
