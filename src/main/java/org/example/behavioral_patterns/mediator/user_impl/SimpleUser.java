package org.example.behavioral_patterns.mediator.user_impl;

import org.example.behavioral_patterns.mediator.Chat;
import org.example.behavioral_patterns.mediator.User;

public class SimpleUser implements User {
    private String name;
    private Chat chat;

    public SimpleUser(String name, Chat chat){
        this.name = name;
        this.chat = chat;
    }
    @Override
    public void sentMessage(String message) {
        chat.sentMessage(this, message);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(name + " получил(а) сообщение: " + message);
    }

    public String getName() {
        return name;
    }
}
