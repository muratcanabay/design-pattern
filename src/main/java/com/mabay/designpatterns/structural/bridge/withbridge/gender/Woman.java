package com.mabay.designpatterns.structural.bridge.withbridge.gender;

import com.mabay.designpatterns.structural.bridge.withbridge.Gender;

public class Woman implements Gender {

    @Override
    public String getGender() {
        return "Woman";
    }
}
