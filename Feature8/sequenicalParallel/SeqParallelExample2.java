package com.sequenicalParallel;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SeqParallelExample2 {
    static int Sumseq()
    {
        return IntStream.rangeClosed(1,100).sum();
    }
    static int parallel()
    {
        return IntStream.rangeClosed(1,100).parallel().sum();
    }
static long checkPerformance(Supplier<Integer>sum,int num)
{
    long start=System.currentTimeMillis();
    long end=System.currentTimeMillis();
    for(int i=0;i<num;i++)
    {
        sum.get();
    }
    System.out.println(start +" "+end);
    return end-start;
}

    public static void main(String[] args) {
        System.out.println(Sumseq());
        System.out.println(parallel());
        System.out.println("sum of sequ "+checkPerformance(SeqParallelExample2::Sumseq,100));
        System.out.println("sum of parall "+checkPerformance(SeqParallelExample2::parallel,10));
    }
}
