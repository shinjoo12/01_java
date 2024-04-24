package com.ohgiraffers.section03.abstraction.problem2;

public class CarRacer {

    //사람이 -> 카      매개변수 car를 받음
    public void startUp(Car car){
        car.startUp();

    }
    public void turnOff(Car car){
        car.turnoff();
    }
    public void go(Car car){
        car.go();
    }
    public void stop(Car car){
        car.stop();
    }
}
