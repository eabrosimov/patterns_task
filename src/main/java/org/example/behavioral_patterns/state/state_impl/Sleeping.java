package org.example.behavioral_patterns.state.state_impl;

import org.example.behavioral_patterns.state.State;

public class Sleeping implements State {
    @Override
    public void doSomething() {
        System.out.println("Егор спит и видит сны о том как он кодит");
    }
}
