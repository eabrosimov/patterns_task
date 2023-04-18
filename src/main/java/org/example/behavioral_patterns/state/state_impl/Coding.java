package org.example.behavioral_patterns.state.state_impl;

import org.example.behavioral_patterns.state.State;

public class Coding implements State {
    @Override
    public void doSomething() {
        System.out.println("Егор кодит все свободное время");
    }
}
