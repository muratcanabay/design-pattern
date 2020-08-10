package com.mabay.designpatterns.creationalpatterns.builder;

/**
 * Robot
 *
 * @author Murat Can Abay
 * @since 17/07/2020
 */
public class Robot {

    private Long en;
    private Long boy;
    private Long derinlik = Long.valueOf(50);
    private Long agirlik = Long.valueOf(0);
    private String isim = nameGenerator(10);
    private Double seriNo = Math.floor(Math.random() * 1000000) + 1;

    public Robot(Long en, Long boy, Long derinlik, Double seriNo) {

        this.en = en;
        this.boy = boy;
        this.derinlik = derinlik;
        this.seriNo = seriNo;
    }

    private String nameGenerator(int length) {

        StringBuilder result = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int charactersLength = characters.length();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt((int) Math.floor(Math.random() * charactersLength)));
        }
        return result.toString();
    }

    public Robot setAgirlik(Long agirlik) {

        this.agirlik = agirlik;
        return this;
    }

    public Robot setIsim(int isim) {

        this.isim = nameGenerator(isim);
        return this;
    }

    public Robot greet() {

        System.out.println("Merhaba ben " + isim + ", Seri numaram " + en +
                " Boyutlarım " + en + "cm / " + boy + "cm / " + derinlik + "cm ve Ağırlığım " + agirlik + "kg");
        return this;
    }
}
