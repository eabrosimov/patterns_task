package org.example.behavioral_patterns.visitor;

import org.example.behavioral_patterns.visitor.element_impl.BodyElement;
import org.example.behavioral_patterns.visitor.element_impl.EngineElement;

public interface Visitor {
    void visit(BodyElement bodyElement);
    void visit(EngineElement engineElement);
}
