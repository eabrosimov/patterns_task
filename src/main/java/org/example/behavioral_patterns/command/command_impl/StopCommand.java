package org.example.behavioral_patterns.command.command_impl;

import org.example.behavioral_patterns.command.Car;
import org.example.behavioral_patterns.command.Command;

public class StopCommand implements Command {
    Car car;

    public StopCommand(Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        car.stopEngine();
    }
}
