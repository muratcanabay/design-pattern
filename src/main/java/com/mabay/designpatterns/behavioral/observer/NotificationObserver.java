package com.mabay.designpatterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class NotificationObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof FriendRequest) {

            FriendRequest friendRequest = (FriendRequest) o;
            friendRequest.setFriendRequestNumber(friendRequest.getFriendRequestNumber() + 1);
        } else if (o instanceof ErrorMessage) {

            ErrorMessage errorMessage = (ErrorMessage) o;
            errorMessage.setMessageSize(errorMessage.getMessageSize() + 1);
        }
    }
}
