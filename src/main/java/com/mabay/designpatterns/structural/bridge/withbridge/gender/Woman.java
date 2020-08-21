package com.mabay.designpatterns.structural.bridge.withbridge.gender;

import com.mabay.designpatterns.structural.bridge.withbridge.Gender;

/**
 * Woman
 *
 * @author Murat Can Abay
 * @since 21/08/2020
 */
public class Woman implements Gender {

    @Override
    public String getGender() {
        return "Woman";
    }
}
