package org.example.behavioral_patterns.chain.logger_impl;

import org.example.behavioral_patterns.chain.Logger;

public class EmailMessage extends Logger {

    public EmailMessage(int priority){
        super(priority);
    }
    @Override
    public void writeMessage() {
        System.out.println("Емейл уведомление: Сервер не доступен, ведутся технические работы");
    }
}
