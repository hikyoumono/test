package com.websarva.wings.amdrpod.udemyandroid9_1;

/**
 * Created by Owner on 2019/01/09.
 */

public class SafeCar extends Car {

    public SafeCar(){
        super();
    }
    public SafeCar(String color){
        super(color);
    }
    public void speedUp(){
        super.speedUp();

        if(this.speed > 100){
            this.speed = 100;
        }
    }
    public void speedDown(){
        super.speedDown();
        if(this.speed < 0){
            this.speed = 0;
        }
    }
    String getInfo(){
        return "安全な" + super.getInfo();
    }
}
