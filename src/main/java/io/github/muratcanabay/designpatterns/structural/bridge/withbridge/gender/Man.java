package io.github.muratcanabay.designpatterns.structural.bridge.withbridge.gender;

import io.github.muratcanabay.designpatterns.structural.bridge.withbridge.Gender;

public class Man implements Gender {

    @Override
    public String getGender() {
        return "Man";
    }
}
