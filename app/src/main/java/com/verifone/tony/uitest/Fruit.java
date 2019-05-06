package com.verifone.tony.uitest;

/**
 * Created by Tony
 * 2019/5/5
 * email: chong.z@verifone.cn
 */
public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
