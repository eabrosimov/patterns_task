package org.example.structural_patterns.adapter;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new PhoneMemoryCard());
        adapter.connectToComputer();
    }
}
