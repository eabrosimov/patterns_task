package org.example.behavioral_patterns.visitor;

public interface Element {
    void accept(Visitor visitor);
}
