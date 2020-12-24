package io.github.muratcanabay.designpatterns.structural.bridge.withbridge.gender;

import io.github.muratcanabay.designpatterns.structural.bridge.withbridge.Gender;

public class Woman implements Gender {

    @Override
    public String getGender() {
        return "Woman";
    }
}
