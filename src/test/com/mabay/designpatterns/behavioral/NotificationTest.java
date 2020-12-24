package com.mabay.designpatterns.behavioral;

import com.mabay.designpatterns.behavioral.observer.ErrorMessage;
import com.mabay.designpatterns.behavioral.observer.FriendRequest;
import com.mabay.designpatterns.behavioral.observer.NotificationObserver;
import org.junit.Test;

public class NotificationTest {

    @Test
    public void testNotification() {

        FriendRequest friendRequest = new FriendRequest();
        ErrorMessage errorMessage = new ErrorMessage();

        NotificationObserver notificationObserver = new NotificationObserver();

        friendRequest.addObserver(notificationObserver);
        System.out.println("Friend request = " + friendRequest.getFriendRequestNumber());
        friendRequest.sendFriendRequest();
        System.out.println("Friend request = " + friendRequest.getFriendRequestNumber());

        errorMessage.addObserver(notificationObserver);
        System.out.println("Error message number = " + errorMessage.getMessageSize());
        errorMessage.sendError();
        System.out.println("Error message number = " + errorMessage.getMessageSize());
    }
}
