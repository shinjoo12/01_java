package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product {


    @Override
    public void absMethod() {
        System.out.println("Product 클래스의 absmethod를 오버라이딩 한 메소드를 호출함..");

    }

    public void printSmartPhone(){
        System.out.println("smartphone클래스의 printSmartPhone 메소드를 호출함 ");
    }
}
