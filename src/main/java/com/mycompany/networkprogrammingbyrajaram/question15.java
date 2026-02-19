
package com.mycompany.networkprogrammingbyrajaram;
import java.net.*;
public class question15 {
    public static void main(String[] args) throws Exception{
        String encode= "Rajaram+%40+silwal";
        String original= URLDecoder.decode(encode, "UTF-8");
        
        System.out.println("Encoded: "+ encode);
        System.out.println("Decoded original: "+original);
    }
    
}
