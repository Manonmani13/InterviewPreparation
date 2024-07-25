package com.proretention.scrm.Integration.Interpreter;

public class InterpreterPatternDemo {
    public static Expression getMaleExpressioin()
    {
        Expression rob=new TerminalExpression("Robert");
        Expression john=new TerminalExpression("John");
        return new OrExpression(rob, john);

    }
    public static Expression getMarriedWomenExpression()
    {
        Expression rob=new TerminalExpression("Julie");
        Expression married=new TerminalExpression("Married");
        return new AndExpression(rob, married);
    }

    public static void main(String[] args) {
        Expression isMale =getMaleExpressioin();

        Expression iswomen=getMarriedWomenExpression();
        System.out.println( isMale.interpret("Robert") );
        System.out.println( iswomen.interpret("Married Julie") );

    }

}
