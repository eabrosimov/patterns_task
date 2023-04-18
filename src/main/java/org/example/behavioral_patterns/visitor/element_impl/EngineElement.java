package org.example.behavioral_patterns.visitor.element_impl;

import org.example.behavioral_patterns.visitor.Element;
import org.example.behavioral_patterns.visitor.Visitor;

public class EngineElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
