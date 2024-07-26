package com.proretention.scrm.Integration.responsiblity;

public class ChainPatternDemo {

    public static AbstractLogger getChainOfLogger()
    {
        AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger=new ErrorLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger=new ErrorLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;

    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLogger();
        loggerChain.logMessage(AbstractLogger.INFO,"This is Info");
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }

}
