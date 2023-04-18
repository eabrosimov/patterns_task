package org.example.behavioral_patterns.mediator.chat_impl;

import org.example.behavioral_patterns.mediator.Chat;
import org.example.behavioral_patterns.mediator.user_impl.SimpleUser;
import org.example.behavioral_patterns.mediator.User;

import java.util.ArrayList;
import java.util.List;

public class MyChat implements Chat {
    private List<User> users;

    public MyChat(){
        users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    @Override
    public void sentMessage(User user, String message) {
        SimpleUser sender = (SimpleUser) user;
        for(User u: users){
            if(u != user) {
                u.getMessage(message + " [от " + sender.getName() + "]");
            }
        }
    }
}
