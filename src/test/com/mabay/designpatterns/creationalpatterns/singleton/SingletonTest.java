package com.mabay.designpatterns.creationalpatterns.singleton;

import com.mabay.designpatterns.creational.singleton.SingletonEager;
import com.mabay.designpatterns.creational.singleton.SingletonLazy;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void singletonLazyTest() {
        SingletonLazy lazy = SingletonLazy.getInstance();
        SingletonLazy lazy2 = SingletonLazy.getInstance();

        System.out.println("Lazy: " + lazy);
        System.out.println("Lazy2: " + lazy2);

        Assert.assertEquals(lazy, lazy2);
    }

    @Test
    public void singletonEagerTest() {
        SingletonEager eager = SingletonEager.getInstance();
        SingletonEager eager2 = SingletonEager.getInstance();

        System.out.println("Eager: " + eager);
        System.out.println("Eager2: " + eager2);

        Assert.assertEquals(eager, eager2);
    }
}
