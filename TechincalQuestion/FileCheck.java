package com.practices.javapractices;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileCheck {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("/home/manonmani/Downloads/test");
            System.out.println("File path: " + file.getAbsolutePath());
            Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name());
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println("Read line: " + line);
                if (line.contains("Naveen")) {
                    System.out.println("Match found: " + line);
                }
            }
            sc.close(); // Close the scanner
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

    }
}
