package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement(){
        /*
        * [for문 표현식] 반복되는 횟수를 알고있을때 사용
        * for(초기식; 조건식; 증감식){
        * // 조건식이 참인 경우 실행할 구문 == 반복할 구문
        * }
        * 초기식-> 사용할 변수 식
        * 조건식-> 무한루프?
        * */
        for(int i = 1; i<=10; i++){
            for(int x = 1; x<= 10; x++){
                System.out.println("천원 단위" + x);
            }
             System.out.println("천원 10개 모인 갯수: " + i );
        }
    }
    //1 ~ 9단까지
    public void gugudan(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i +"x"+ j +"="+ (i*j));
            }

        }

    }
    //i = 2

    public void twob() {
        for (int i = 1; i <= 9; i++) {
            for (int x = 1; x <= 9; x++) {
                if(i%2 ==0){
                        System.out.println(i + "*"+ x +"=" + i*x);
                    }
                }
            }
//10명의 이름과 나이를 입력 받아 화면에 출력하기
        //예) 이름 000  , 나이 20
        for (int i = 1; i <=10; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("이름이 무엇인가요");
            String name = sc.nextLine();
            System.out.println("몇 살인가요");
            int age = sc.nextInt();

            System.out.println("이름:" +name);
            System.out.println("나이:" +age);
        }


    }


}






        //10명의 이름과 나이를 입력 받아 화면에 출력하기
        //예) 이름 000  , 나이 20










