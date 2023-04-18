package org.example.behavioral_patterns.state;

import org.example.behavioral_patterns.state.state_impl.Coding;

public class Main {
    public static void main(String[] args) {
        Egor egor = new Egor();
        egor.setState(new Coding());
        egor.doSomething();
        egor.changeState();
        egor.doSomething();
        egor.changeState();
        egor.doSomething();
    }
}
