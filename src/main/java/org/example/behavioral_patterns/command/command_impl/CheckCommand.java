package org.example.behavioral_patterns.command.command_impl;

import org.example.behavioral_patterns.command.Car;
import org.example.behavioral_patterns.command.Command;

public class CheckCommand implements Command {
    Car car;

    public CheckCommand(Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        car.checkEngine();
    }
}
