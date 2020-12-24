package com.mabay.designpatterns.behavioral.observer;

import java.util.Observable;

public class FriendRequest extends Observable {

    private Integer friendRequestNumber = 0;

    public void sendFriendRequest() {

        setChanged();
        notifyObservers();
        System.out.println("Friend request has sended : " + getFriendRequestNumber());
    }

    public Integer getFriendRequestNumber() {
        return friendRequestNumber;
    }

    public void setFriendRequestNumber(Integer friendRequestNumber) {
        this.friendRequestNumber = friendRequestNumber;
    }
}
