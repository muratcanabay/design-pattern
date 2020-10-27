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
package com.mabay.designpatterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * NotificationObserver
 *
 * @author Murat Can Abay
 * @since 27/10/2020
 */
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
