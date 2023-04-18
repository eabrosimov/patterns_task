package org.example.creational_patterns.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new HumanBuilder());

        Unit human = director.build();
        System.out.println(human);
    }
}
