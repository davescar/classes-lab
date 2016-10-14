package com.DAVE;

/**
 * Created by ds on 10/11/16.
 */

public class StopLight {

    private String mLightColor;

    public StopLight(String lightColor) {
        mLightColor = lightColor;
    }

    public boolean isRed() {
        if (mLightColor.equals("red"))
            return true;
        else
            return false;
    }

    public boolean isYellow() {
        if (mLightColor.equals("yellow"))
            return true;
        else
            return false;
    }

    public boolean isGreen() {
        if (mLightColor.equals("green"))
            return true;
        else
            return false;
    }

    public void setLightColor(String lightColor) {
        mLightColor = lightColor;
    }
}