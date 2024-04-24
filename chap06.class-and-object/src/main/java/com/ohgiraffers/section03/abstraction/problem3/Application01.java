package com.ohgiraffers.section03.abstraction.problem3;

import com.ohgiraffers.section03.abstraction.problem3.Car;
import com.ohgiraffers.section03.abstraction.problem3.CarRacer;

public class Application01 {
    public static void main(String[] args) {
        //1) car클래스
        Car ram = new Car();
        ram.setName("람보르기니");

        Car po = new Car();
        po.setName("포르쉐");
        CarRacer lee = new CarRacer();
        lee.setCar(ram);
        lee.myCarInfo();

        lee.startUp();
        lee.go();
        lee.stop();
        lee.turnOff();

    }
}
