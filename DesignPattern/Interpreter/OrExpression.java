package com.proretention.scrm.Integration.Interpreter;

public class OrExpression implements Expression{
    Expression expression=null;
    Expression expression2=null;

    public OrExpression(Expression expression,Expression expression2)
    {
        this.expression=expression;
        this.expression2=expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression.interpret(context)||expression2.interpret(context);
    }
}
