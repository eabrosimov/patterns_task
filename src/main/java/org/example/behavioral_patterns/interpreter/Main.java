package org.example.behavioral_patterns.interpreter;

import org.example.behavioral_patterns.interpreter.expression_impl.AndExpression;
import org.example.behavioral_patterns.interpreter.expression_impl.OrExpression;
import org.example.behavioral_patterns.interpreter.expression_impl.TerminalExpression;

public class Main {
    public static void main(String[] args) {
        Expression expression1 = getJavaExpression();
        System.out.println(expression1.interpret("Java"));

        Expression expression2 = getJavaEEExpression();
        System.out.println(expression2.interpret("Java Spring"));
    }

    public static Expression getJavaExpression(){
        Expression expression1 = new TerminalExpression("Java");
        Expression expression2 = new TerminalExpression("Java Core");
        return new OrExpression(expression1, expression2);
    }

    public static Expression getJavaEEExpression(){
        Expression expression1 = new TerminalExpression("Java");
        Expression expression2 = new TerminalExpression("Spring");
        return new AndExpression(expression1, expression2);
    }
}

