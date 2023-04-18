package org.example.behavioral_patterns.template_method;

public abstract class Abs {
    public void doTemplateAction(){
        System.out.print(1);
        doSpecialAction();
        System.out.print(3);
        System.out.println();
    }
    abstract void doSpecialAction();
}
