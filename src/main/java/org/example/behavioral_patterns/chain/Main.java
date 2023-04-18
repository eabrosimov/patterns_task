package org.example.behavioral_patterns.chain;

import org.example.behavioral_patterns.chain.logger_impl.AccountMessage;
import org.example.behavioral_patterns.chain.logger_impl.EmailMessage;
import org.example.behavioral_patterns.chain.logger_impl.ScreenMessage;

public class Main {

    public static void main(String[] args) {
        Logger logger1 = new ScreenMessage(Priority.NORMAL);
        Logger logger2 = new AccountMessage(Priority.PROBLEM);
        Logger logger3 = new EmailMessage(Priority.ERROR);

        logger1.setNext(logger2);
        logger2.setNext(logger3);

        logger1.sentMessage(Priority.NORMAL);
    }
}
