package org.example.behavioral_patterns.interpreter.expression_impl;

import org.example.behavioral_patterns.interpreter.Expression;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }
    @Override
    public boolean interpret(String context) {
        if(context.contains(data))
            return true;

        return false;
    }
}
