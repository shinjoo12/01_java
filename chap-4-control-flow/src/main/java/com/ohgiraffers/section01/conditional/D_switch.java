package com.ohgiraffers.section01.conditional;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

//D_switch 라는 클래스를 모두가 사용할 수 있도록 만든다.
public class D_switch {//  D_switch 의 시작

    //클래스 내부 속성
    public static void main(String[] args) {

    }
//
//
//
//    //testSimpleSwitchStatement 라는 반환값이 없는 메소드를 모두가 사용할 수 있도록 만든다.
        public void testSimpleSwitchStatement(){ //testSimpleSwitch 메소드의 시작
//        /*
//         * [switch 문 표현식]
//         * switch(비교대상값){
//         * case 비교값 : 비교값이 참인 경우 실행할 구문; break;
//         * case 비교값 : 비교값이 참인 경우 실행할 구문; break;
//         * default : case에 모두 해당하지 않는 경우 ; break;
//         * }   =else
//         * */
//
//
//        //사용자한테 값을 입력받을 수 있는 객체를 생성함
            Scanner sc = new Scanner(System.in);
//        // 화면에 첫 번째 정수 입력: 를 입력하라는 내용을 출력함
            System.out.println("첫 번째 정수 입력: ");
//        //사용자가 입력한 값을 정수로 받아서 first에 대입함
            int first = sc.nextInt();
//        //사용자의 화면에 두 번째 정수를 입력하라고 출력함
            System.out.println("두 번째 정수 입력: ");
//        //사용자가 입력한 값을 second 라는 변수에 정수로 받아서 대입함
            int second = sc.nextInt();
//        //사용자의 화면에 연산 기호를 입력하라고 출력함
            System.out.println("연산 기호 출력");
//        //사용자가 입력한 연산 기호를 문자로 받아서 op에 대입함
            char op = sc.next().charAt(0);
            double result = 0.0;
//
//        //아래의 계산기를 완성합니다.
//        //연산은 +-*/ 가 가능하며 이외는 계산 불가능이라는 결과를 화면에 출력합니다.
//
            switch (op) { //op의 변수를 기준으로 아래의 값과 일치하는지 확인함
//            //op가 + 와 같다면 first + second 결과를 화면에 출력함
                case '+':
                    System.out.println(first + second);
                    break;
//            //op가 - 와 같다면 first - second 결과를 화면에 출력함
                case '-':
                    System.out.println(first - second);
                    break;
//            //op가 * 와 같다면 first * second 결과를 화면에 출력함
                case '*':
                    System.out.println(first * second);
                    break;
//            //op가 / 와 같다면 first / second 결과를 화면에 출력함
                case '/':
                    System.out.println(first / second);
                    break;
//            //op가 위의 수식에 모두 만족하지 않으면 같지 않음을 출력함
                default:
                    System.out.println("연산 불가");
                    break;
//
            }
//
        } //testSimpleSwitch 메소드의 종료

        // 계산기를 만들고 결과를 반환합니다. (switch를 이용함) 반환된 결과는 application02에서 출력해주세요
        // + - / * 만 제공하고 일치하는 연산이 없는 경우 연산불가라는 결과를 출력하고 반환 값을 0.0 으로 합니다.

        public double switchCalculator(){


            //1. 값을 입력받음
            Scanner sc = new Scanner(System.in);
            //2. 첫 수 입력받기
            int first = sc.nextInt();
            //3. 두번째 수 입력
            int second = sc.nextInt();
            //4.연산기호 입력
            char op = sc.next().charAt(0);
            double result = 0;
            //5. 연산기호를 비교
            switch (op) {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;
                case '*':
                    result = first * second;
                    break;
                case '/':
                    result = first / second;
                    break;
                default:
                    System.out.println("연산 불가");
                    break;
            }
            //6. 반환
            return result;


        }
    }

