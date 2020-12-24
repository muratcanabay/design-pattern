package com.mabay.designpatterns.creational.factory;

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
