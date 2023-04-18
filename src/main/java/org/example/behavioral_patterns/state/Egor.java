package org.example.behavioral_patterns.state;

import org.example.behavioral_patterns.state.state_impl.Coding;
import org.example.behavioral_patterns.state.state_impl.Eating;
import org.example.behavioral_patterns.state.state_impl.Sleeping;

public class Egor {
    private State state;

    public void setState(State state){
        this.state = state;
    }

    public void changeState(){
        if(state instanceof Coding)
            setState(new Eating());
        else if(state instanceof Eating)
            setState(new Sleeping());
        else if(state instanceof Sleeping)
            setState(new Coding());
    }

    public void doSomething(){
        state.doSomething();
    }
}
