package com.mabay.designpatterns.behavioral.observer;

import java.util.Observable;

public class ErrorMessage extends Observable {

    private Integer messageSize = 0;

    public void sendError() {

        setChanged();
        notifyObservers();
        System.out.println("An error occured : " + getMessageSize());
    }

    public Integer getMessageSize() {
        return messageSize;
    }

    public void setMessageSize(Integer messageSize) {
        this.messageSize = messageSize;
    }
}
