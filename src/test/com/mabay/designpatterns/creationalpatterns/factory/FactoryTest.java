package com.mabay.designpatterns.creationalpatterns.factory;

import com.mabay.designpatterns.creational.factory.Bmw;
import com.mabay.designpatterns.creational.factory.Car;
import com.mabay.designpatterns.creational.factory.CarFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * FactoryTest
 *
 * @author Murat Can Abay
 * @since 17/07/2020
 */
public class FactoryTest {

    @Test
    public void bmwTest() {
        CarFactory carFactory = new CarFactory();
        Car bmw = carFactory.getBrand("Bmw");
        String brand = bmw.getBrand();
        Assert.assertEquals("BMW", brand);
    }

    @Test
    public void mercedesTest() {
        CarFactory carFactory = new CarFactory();
        Car mercedes = carFactory.getBrand("Mercedes");
        String brand = mercedes.getBrand();
        Assert.assertEquals("Mercedes Benz", brand);
    }

    @Test
    public void toyotaTest() {
        CarFactory carFactory = new CarFactory();
        Car toyota = carFactory.getBrand("Toyota");
        String brand = toyota.getBrand();
        Assert.assertEquals("Toyota", brand);
    }

    @Test
    public void bmwInstanceTest() {
        CarFactory carFactory = new CarFactory();
        Car bmw = carFactory.getBrand("Bmw");
        Assert.assertEquals(true, bmw instanceof Bmw);
    }

    @Test
    public void carInstanceTest() {
        CarFactory carFactory = new CarFactory();
        Car bmw = carFactory.getBrand("Bmw");
        Assert.assertEquals(true, bmw instanceof Car);
    }
}
