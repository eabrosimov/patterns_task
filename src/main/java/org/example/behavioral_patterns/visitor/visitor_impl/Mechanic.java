package org.example.behavioral_patterns.visitor.visitor_impl;

import org.example.behavioral_patterns.visitor.Visitor;
import org.example.behavioral_patterns.visitor.element_impl.BodyElement;
import org.example.behavioral_patterns.visitor.element_impl.EngineElement;

public class Mechanic implements Visitor {
    @Override
    public void visit(BodyElement bodyElement) {
        System.out.println("Механик отполировал кузов");
    }

    @Override
    public void visit(EngineElement engineElement) {
        System.out.println("Механик перебрал двигатель");
    }
}
