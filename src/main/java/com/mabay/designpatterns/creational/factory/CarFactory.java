package com.mabay.designpatterns.creational.factory;

/**
 * CarFactory
 *
 * @author Murat Can Abay
 * @since 17/07/2020
 */
public class CarFactory {

    public Car getBrand(String brand) {

        if (brand.equals("Bmw")) {
            return new Bmw();
        }

        if (brand.equals("Mercedes")) {
            return new MercedesBenz();
        }

        if (brand.equals("Toyota")) {
            return new Toyota();
        }

        return null;
    }
}
