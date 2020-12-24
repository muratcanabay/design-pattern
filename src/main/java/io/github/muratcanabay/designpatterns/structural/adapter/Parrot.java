package io.github.muratcanabay.designpatterns.structural.adapter;

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
