package com.collection.Hash;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        FileInputStream fis=new FileInputStream("/home/manonmani/IdeaProjects/CollectionConcept/src/main/java/com/collection/Hash/test.properties");
        properties.load(fis);
        System.out.println(properties);
       String s= properties.getProperty("naveen");
        System.out.println(s);
        properties.setProperty("pandukumar", String.valueOf(40));
        System.out.println(properties);
        FileOutputStream fos=new FileOutputStream("/home/manonmani/IdeaProjects/CollectionConcept/src/main/java/com/collection/Hash/test.properties");
        properties.store(fos,"Update ");
    }
}
