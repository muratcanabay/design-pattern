package io.github.muratcanabay.designpatterns.structural.bridge.withbridge.cloth;

import io.github.muratcanabay.designpatterns.structural.bridge.withbridge.Cloth;
import io.github.muratcanabay.designpatterns.structural.bridge.withbridge.Gender;

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
