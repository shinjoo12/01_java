package com.ohgiraffers.section03.abstraction.problem3;


public class CarRacer {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) { //setcar 카레이서에게 카를 주는것
        this.car = car;    //this 의미 ->내가 가진 카
    }

    public void startUp( ){
        this.car.startUp();

    }
    public void turnOff(){
        this.car.turnoff();
    }
    public void go(){
        this.car.go();
    }
    public void stop(){
        this.car.stop();
    }
    public void myCarInfo(){
        System.out.println(this.car.carName());
    }
}


