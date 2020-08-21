package com.mabay.designpatterns.structural.bridge.withbridge.gender;

import com.mabay.designpatterns.structural.bridge.withbridge.Gender;

/**
 * Man
 *
 * @author Murat Can Abay
 * @since 21/08/2020
 */
public class Man implements Gender {

    @Override
    public String getGender() {
        return "Man";
    }
}
