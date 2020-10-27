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

/**
 * FriendRequest
 *
 * @author Murat Can Abay
 * @since 27/10/2020
 */
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
