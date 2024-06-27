package com.ecoder;

import java.util.Base64;

public class EncoderExample2 {
    public static void main(String[] args) {
        Base64.Encoder encoder=Base64.getUrlEncoder();
        String eStr= encoder.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());
        System.out.println(eStr);
        Base64.Decoder de=Base64.getDecoder();
        String dStr = new String(de.decode(eStr));

        System.out.println(dStr);
    }
}
