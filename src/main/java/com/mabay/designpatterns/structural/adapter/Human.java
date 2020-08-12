package com.mabay.designpatterns.structural.adapter;

/**
 * Human
 *
 * @author Murat Can Abay
 * @since 12/08/2020
 */
public class Human implements Skills {

    public void speak() {
        System.out.println(" speaks..");
    }

    public void eat() {
        System.out.println(" eat..");
    }
}
