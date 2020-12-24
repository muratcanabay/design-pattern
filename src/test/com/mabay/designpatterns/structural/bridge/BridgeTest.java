package com.mabay.designpatterns.structural.bridge;

import com.mabay.designpatterns.structural.bridge.withbridge.cloth.Trousers;
import com.mabay.designpatterns.structural.bridge.withbridge.gender.Man;
import org.junit.Test;

public class BridgeTest {

    @Test
    public void trousersWithBridgeTest() {
        Man man = new Man();
        Trousers trousers = new Trousers(man);
        trousers.putOn();
    }
}
