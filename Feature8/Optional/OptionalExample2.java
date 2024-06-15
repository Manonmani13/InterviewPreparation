package com.Optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        Optional<String> ofNull=Optional.of("Java");
        System.out.println(ofNull.isPresent()?ofNull:ofNull.isEmpty());
        Optional<String> of=Optional.of("Optional of Method");
        System.out.println(of.isPresent()?of:of.isEmpty());
//        Optional<String> of1=Optional.of(null);
//        System.out.println(of1.isPresent()?of.get():Optional.empty());

    }
}
