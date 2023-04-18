package org.example.behavioral_patterns.interpreter.expression_impl;

import org.example.behavioral_patterns.interpreter.Expression;

public class OrExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public OrExpression(Expression leftExpression, Expression rightExpression){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean interpret(String context) {
        return leftExpression.interpret(context) || rightExpression.interpret(context);
    }
}
