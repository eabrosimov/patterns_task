package org.example.behavioral_patterns.template_method;

public class Main {

    public static void main(String[] args) {
        Abs abs1 = new X();
        Abs abs2 = new Y();

        abs1.doTemplateAction();
        abs2.doTemplateAction();
    }
}
