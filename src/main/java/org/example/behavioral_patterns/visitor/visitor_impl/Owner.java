package org.example.behavioral_patterns.visitor.visitor_impl;

import org.example.behavioral_patterns.visitor.Visitor;
import org.example.behavioral_patterns.visitor.element_impl.BodyElement;
import org.example.behavioral_patterns.visitor.element_impl.EngineElement;

public class Owner implements Visitor {
    @Override
    public void visit(BodyElement bodyElement) {
        System.out.println("Владелец поцарапал кузов");
    }

    @Override
    public void visit(EngineElement engineElement) {
        System.out.println("Владелец износил двигатель");
    }
}
