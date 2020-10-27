/*
 * Copyright 2020 Universal Bilgi Teknolojileri.
 *
 * UKL 1.1 lisansı ile lisanslanmıştır. Bu dosyanın lisans koşullarına uygun
 * olmayan şekilde kullanımı yasaklanmıştır. Lisansın bir kopyasını aşağıdaki
 * linkten edinebilirsiniz.
 *
 * http://www.uni-yaz.com/lisans/ukl_1_1.pdf
 *
 * Yasalar aksini söylemediği veya yazılı bir sözleşme ile aksi belirtilmediği sürece,
 * bu yazılım mevcut hali ile hiç bir garanti vermeden veya herhangi bir şart ileri
 * sürmeden dağıtılır. Bu yazılımın edinim izinleri ve limitler konusunda lisans
 * sözleşmesine bakınız.
 *
 */
package com.mabay.designpatterns.behavioral;

import com.mabay.designpatterns.behavioral.observer.ErrorMessage;
import com.mabay.designpatterns.behavioral.observer.FriendRequest;
import com.mabay.designpatterns.behavioral.observer.NotificationObserver;
import org.junit.Test;

/**
 * NotificationTest
 *
 * @author Murat Can Abay
 * @since 27/10/2020
 */
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
