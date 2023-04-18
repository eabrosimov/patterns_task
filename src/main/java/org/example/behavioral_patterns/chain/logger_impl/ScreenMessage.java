package org.example.behavioral_patterns.chain.logger_impl;

import org.example.behavioral_patterns.chain.Logger;

public class ScreenMessage extends Logger {

    public ScreenMessage(int priority){
        super(priority);
    }
    @Override
    public void writeMessage() {
        System.out.println("Внутриигровое уведомление: Сервер доступен, приятной игры");
    }
}
