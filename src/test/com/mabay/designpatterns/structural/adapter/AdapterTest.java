package com.mabay.designpatterns.structural.adapter;

import com.mabay.designpatterns.structural.adapter.Human;
import com.mabay.designpatterns.structural.adapter.Parrot;
import org.junit.Test;

/**
 * AdapterTest
 *
 * @author Murat Can Abay
 * @since 12/08/2020
 */
public class AdapterTest {

    @Test
    public void parrotTest() {

        Human human = new Human();

        System.out.print(human.getClass().getSimpleName());
        human.speak();
        System.out.print(human.getClass().getSimpleName());
        human.eat();

        Parrot adapter = new Parrot(human);

        System.out.print(adapter.getClass().getSimpleName());
        adapter.speak();
        System.out.print(adapter.getClass().getSimpleName());
        adapter.eat();
        System.out.print(adapter.getClass().getSimpleName());
        adapter.fly();
    }
}
