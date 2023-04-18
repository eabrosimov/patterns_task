package org.example.behavioral_patterns.mediator;

import org.example.behavioral_patterns.mediator.chat_impl.MyChat;
import org.example.behavioral_patterns.mediator.user_impl.SimpleUser;

public class Main {
    public static void main(String[] args) {
        MyChat chat = new MyChat();

        User user1 = new SimpleUser("Egor", chat);
        User user2 = new SimpleUser("Marina", chat);
        User user3 = new SimpleUser("Galina", chat);

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.sentMessage("Привет всем");
    }

}
