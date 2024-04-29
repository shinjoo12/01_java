package com.ohgiraffers.section03.interfaceimplements;

public class Application01 {  //추상메소드의 모음->interface

    public static void main(String[] args) {
    /*
    * 인터페이스
    * 여기서 다루게 되는 인터페이스는 자바의 클래스와 유사한 형태이지만
    * 추상메소드와 상수 필드만 가질 수 있는 클래스의 변형체를 말한다.
    *
    * 인터페이스의 사용 목적
    * 1. 추상클래스와 비슷하게 필요한 기능을 공통화 해서 강제성을 부여할 목적으로 사용한다.
    * 2. 자바의 단일 상속의 단점을 극복할 수 있다.
    *
    * */



        InterProduct interProduct = new Product();
        interProduct.nonStaticMethod();
        interProduct.absMethod();

        interProduct.defaultMethod();
        InterProduct.staticMethod();
        System.out.println(InterProduct.MAX_NUM);



    }
}
