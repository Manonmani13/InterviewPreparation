package com.ecoder;

import java.util.Base64;

public class EncoderExample {
    public static void main(String[] args) {
        Base64.Encoder encoder=Base64.getEncoder();
        byte byteArr    []={1,2};
        byte byteArr2[]=encoder.encode(byteArr);
        System.out.println(byteArr2);
        byte byteArr3[]=new byte[5];
        int x=encoder.encode(byteArr,byteArr3);
        System.out.println(byteArr3);
        System.out.println(x);;
    }
}
