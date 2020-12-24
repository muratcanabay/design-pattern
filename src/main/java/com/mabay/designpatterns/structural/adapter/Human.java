package com.mabay.designpatterns.structural.adapter;

public class Human implements Skills {

    public void speak() {
        System.out.println(" speaks..");
    }

    public void eat() {
        System.out.println(" eat..");
    }
}
