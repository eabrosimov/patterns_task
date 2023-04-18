package org.example.behavioral_patterns.visitor;

import org.example.behavioral_patterns.visitor.element_impl.BodyElement;
import org.example.behavioral_patterns.visitor.element_impl.EngineElement;
import org.example.behavioral_patterns.visitor.visitor_impl.Mechanic;
import org.example.behavioral_patterns.visitor.visitor_impl.Owner;

public class Main {
    public static void main(String[] args) {
        Visitor visitor1 = new Mechanic();
        Visitor visitor2 = new Owner();

        EngineElement engineElement = new EngineElement();
        BodyElement bodyElement = new BodyElement();

        engineElement.accept(visitor2);
        bodyElement.accept(visitor2);

        System.out.println("====================");

        engineElement.accept(visitor1);
        bodyElement.accept(visitor1);
    }
}
