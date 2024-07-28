package com.practices.javafeature11;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Path file= Paths.get("/home/manonmani/Documents/test");
        String filecontent= Files.readString(file, StandardCharsets.UTF_8);
        System.out.println(filecontent);
    }
}
