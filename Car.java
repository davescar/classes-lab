package com.DAVE;

/**
 * Created by ds on 10/11/16.
 */

public class Car {

    private String mColor;
    private String mBrand;
    private Integer mTopSpeed;

    public Car (String color, String brand, int topSpeed) {
        mColor = color;
        mBrand = brand;
        mTopSpeed = topSpeed;
    }


    public void go() {
        System.out.println("The car is going fast");
    }

    public void slow() {
        System.out.println("The car is going slowly");
    }

    public void stop() {
        System.out.println("The car has stopped");
    }

    public String getColor() {
        return mColor;
    }

    public String getBrand() {
        return mBrand;
    }

    public Integer getTopSpeed() {
        return mTopSpeed;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public void setBrand(String brand) {
        mBrand = brand;
    }

    public void setTopSpeed(Integer topSpeed) {
        mTopSpeed = topSpeed;
    }
}
