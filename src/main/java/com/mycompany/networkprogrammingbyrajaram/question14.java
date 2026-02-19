
package com.mycompany.networkprogrammingbyrajaram;
import java.net.*;
public class question14 {
    public static void main(String[] args)throws Exception{
        String original="Rajaram @ silwal";
        String encoded= URLEncoder.encode(original, "UTF-8");
        System.out.println("Original: "+ original);
        System.out.println("Encoded: "+ encoded);
    }
    
}
