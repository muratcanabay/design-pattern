package com.mabay.designpatterns.creational.builder;

import java.util.HashSet;
import java.util.Set;

public class RobotFactory {

    static private Set seriNoPool = new HashSet();
    private Long fabrikaEn;
    private Long fabrikaBoy;
    private Long fabrikaDerinlik;
    private Long basariliSayisi = 0L;
    private Long basarisizSayisi = 0L;
    private Long toplamRobotSayisi = 0L;

    public RobotFactory(Long fabrikaEn, Long fabrikaBoy, Long fabrikaDerinlik) {

        this.fabrikaEn = fabrikaEn;
        this.fabrikaBoy = fabrikaBoy;
        this.fabrikaDerinlik = fabrikaDerinlik;
    }

    public Robot robotUret(Long en, Long boy, Long derinlik) {

        Double seriNo = Math.floor(Math.random() * 10) + 1;
        while (RobotFactory.seriNoPool.contains((seriNo))) {
            if (RobotFactory.seriNoPool.size() == 10) {
                throw new Error("SeriNo bitti.");
            }
            System.out.println("seriNo çakışması" + seriNo);
            seriNo = Math.floor(Math.random() * 10) + 1;
        }
        RobotFactory.seriNoPool.add(seriNo);

        Robot robot = new Robot(en, boy, derinlik, seriNo);
        return robot;
    }

    public RobotFactory robotUretimiBasariliMi(boolean basarili) {

        if (basarili) {
            this.basariliSayisi += 1;
        } else {
            this.basarisizSayisi += 1;
        }
        this.toplamRobotSayisi += 1;
        return this;
    }

    public Long uretilenToplamRobotSayisi() {
        return this.toplamRobotSayisi;
    }
}
