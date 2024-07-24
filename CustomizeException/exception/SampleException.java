package com.proretention.scrm.Integration.exception;

public class SampleException {
    public static void main(String[] args) throws ExceptionSam {
       try{
           throw new ExceptionSam("Not Working");
       }
       catch (ExceptionSam e)
       {
           System.err.println("Caught custom exception: " + e.getMessage());
           e.printStackTrace();
       }
    }
}
