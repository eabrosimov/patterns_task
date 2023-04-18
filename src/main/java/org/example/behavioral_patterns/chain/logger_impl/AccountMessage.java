package org.example.behavioral_patterns.chain.logger_impl;

import org.example.behavioral_patterns.chain.Logger;

public class AccountMessage extends Logger {

    public AccountMessage(int priority){
        super(priority);
    }
    @Override
    public void writeMessage() {
        System.out.println("Уведомление для аккаутна: Сервер перегружен, возможны задержки отклика во время игры");
    }
}
