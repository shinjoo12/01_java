package com.ohgiraffers.section01.conditional;

//프로그램내에서 모두가 사용할 수 있는 Application02 라는 클래스를 선언한다.
public class Application02 {// Application02의 시작
   //프로그램이 시작시 바로 사용할 수 있도록 static 영역에 main이라는 함수를 만들고 문자열 배열의 타입을 가진
    //args라는 변수를 선언한다.

    public static void main(String[] args) {//main의 시작
       // D_switch라는 자료형을 가진 dswitch 변수를 만들고 D_switch 타입으로 값을 제공한다.
        // D_switch 는 사용자 정의 자료형으로써 타입은 우리가 만든 D_switch를 확인해야한다.
      //  D_switch dSwitch = new D_switch();
        //dSwitch 변수가 가지고 있는 testSimple 메소드를 실행한다.
      //  dSwitch.testSimpleSwitchStatement();

        //0.D_switch 를 만든다.
        D_switch dswitch =new D_switch();
        D_switch grade =new D_switch();
        //1. 값을 반환 받는다.
        double result = dswitch.switchCalculator();
       //2. 화면에 출력한다.
        System.out.println(result);




    }//main의 종료
}//Application02의 종료
