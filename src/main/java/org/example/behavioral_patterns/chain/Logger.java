package org.example.behavioral_patterns.chain;

public abstract class Logger {
    private int priority;
    private Logger next;

    public Logger(int priority){
        this.priority = priority;
    }

    public void sentMessage(int priority){
        if(this.priority >= priority){
            writeMessage();
        } else {
            if (next != null)
                next.sentMessage(priority);
        }
    }

    public void setNext(Logger logger){
        next = logger;
    }

    public abstract void writeMessage();
}
