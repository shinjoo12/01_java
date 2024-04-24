package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton singleton = new EagerSingleton(); //내가 나를 만듬

    private EagerSingleton(){  //외부 접근금지
        System.out.println("생성됨");


    }

    public static EagerSingleton getInstance(){//getInstance는 자신을 반환함
        return singleton;   //singleton 반환 singleton == EagerSingleton
    }
}
