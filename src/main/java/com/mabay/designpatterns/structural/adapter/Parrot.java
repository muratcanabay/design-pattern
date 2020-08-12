package com.mabay.designpatterns.structural.adapter;

/**
 * Parrot
 *
 * @author Murat Can Abay
 * @since 12/08/2020
 */
public class Parrot implements BirdSkills {

    Human human;

    public Parrot(Human human) {
        this.human = human;
    }

    public void speak() {
        human.speak();
    }

    public void eat() {
        System.out.println(" eats..");
    }

    public void fly() {
        System.out.println("Parrot flies..");
    }
}
