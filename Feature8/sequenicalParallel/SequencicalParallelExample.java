package com.sequenicalParallel;

import javax.swing.*;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SequencicalParallelExample {
    public static void main(String[] args) {
        String str[]={"1","2","3","4","5"};
        System.out.println("Sequencial Run");
        PrintStream(Arrays.stream(str));
        System.out.println("Parallel stream");
        PrintStream(Arrays.stream(str).parallel());

    }
    static void PrintStream(Stream<String> str)
    {
        str.forEach(s->{
            System.out.println(LocalTime.now()+" Value "+s+" :"+Thread.currentThread().getName());
            try{
                Thread.sleep(200);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        });

    }

}
