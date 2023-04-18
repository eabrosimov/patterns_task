package org.example.behavioral_patterns.state.state_impl;

import org.example.behavioral_patterns.state.State;

public class Eating implements State {
    @Override
    public void doSomething() {
        System.out.println("Егор ест пока кодит");
    }
}
