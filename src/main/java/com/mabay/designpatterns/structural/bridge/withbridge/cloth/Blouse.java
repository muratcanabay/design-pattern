package com.mabay.designpatterns.structural.bridge.withbridge.cloth;

import com.mabay.designpatterns.structural.bridge.withbridge.Cloth;
import com.mabay.designpatterns.structural.bridge.withbridge.Gender;

/**
 * Blouse
 *
 * @author Murat Can Abay
 * @since 21/08/2020
 */
public class Blouse extends Cloth {

    private Gender gender;

    public Blouse(Gender gender) {
        super(gender);
        this.gender = gender;
    }

    @Override
    public void putOn() {
        System.out.println(gender.getGender() + " puts the " + getClass().getSimpleName() + " on");
    }
}
