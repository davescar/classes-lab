package com.DAVE;

public class Main {

    public static void main(String[] args) {
        /* write your code here */

        StopLight light = new StopLight("red");
        System.out.println(light.isRed());
        light.setLightColor("green");
        System.out.println(light.isRed());


        Car ride = new Car("blue", "BMW", 160);
        System.out.println(ride.getBrand());
        System.out.println(ride.getTopSpeed());

        for (int i = 0; i < 30 ; i++) {

           if (light.isGreen()){
               light.setLightColor("yellow");
           }
           else if (light.isYellow()){
               light.setLightColor("red");
           }
           else if (light.isRed()) {
               light.setLightColor("green");
           }
        }
    }
}
