package com.mabay.designpatterns.creational.singleton;

/**
 * SingletonEager
 *
 * @author Murat Can Abay
 * @since 17/07/2020
 */
public class SingletonEager {

    private static SingletonEager singletonEager = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return singletonEager;
    }
}
