package com.Thread;

public class CakeCounterExampleSync implements Runnable {
    Counter counter;
    CakeCounterExampleSync(Counter counter)
    {
        this.counter=counter;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;i++)
        {
            counter.increment();
        }

    }
}
class Counter{
    int cakeCounter=0;
    public synchronized  void increment()
    {
        cakeCounter++;
    }
}


