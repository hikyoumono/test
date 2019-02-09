package com.websarva.wings.amdrpod.udemyandroid9_1;

/**
 * Created by Owner on 2019/01/08.
 */

public class Car {
    protected String info;
    protected int speed;

    public Car() {
        this.info = "赤";
        this.speed = 0;
    }
    public Car(String color){
        this.info=color;
        this.speed=0;
    }
    public void speedUp(){
        this.speed +=50;
    }
    public void speedDown(){
        this.speed -=50;
    }
    String getInfo(){
        return this.info;
    }
    int getSpeed(){
        return this.speed;
    }
}