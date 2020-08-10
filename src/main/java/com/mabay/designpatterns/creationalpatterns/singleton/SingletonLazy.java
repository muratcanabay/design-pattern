package com.mabay.designpatterns.creationalpatterns.singleton;

/**
 * SingletonLazy
 *
 * @author Murat Can Abay
 * @since 17/07/2020
 */
public class SingletonLazy {

    private static SingletonLazy singletonLazy;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {

        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }

        return singletonLazy;
    }
}
