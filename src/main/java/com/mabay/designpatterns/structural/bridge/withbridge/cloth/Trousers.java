package com.mabay.designpatterns.structural.bridge.withbridge.cloth;

import com.mabay.designpatterns.structural.bridge.withbridge.Cloth;
import com.mabay.designpatterns.structural.bridge.withbridge.Gender;

/**
 * Trousers
 *
 * @author Murat Can Abay
 * @since 21/08/2020
 */
public class Trousers extends Cloth {

    private Gender gender;

    public Trousers(Gender gender) {
        super(gender);
        this.gender = gender;
    }

    @Override
    public void putOn() {
        System.out.println(gender.getGender() + " puts the " + getClass().getSimpleName() + " on");
    }
}
