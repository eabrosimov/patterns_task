package org.example.behavioral_patterns.command;

import org.example.behavioral_patterns.command.command_impl.CheckCommand;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Command command = new CheckCommand(car);
        command.execute();
    }
}
