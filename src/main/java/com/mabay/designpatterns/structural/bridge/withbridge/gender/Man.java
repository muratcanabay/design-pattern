package com.mabay.designpatterns.structural.bridge.withbridge.gender;

import com.mabay.designpatterns.structural.bridge.withbridge.Gender;

public class Man implements Gender {

    @Override
    public String getGender() {
        return "Man";
    }
}
