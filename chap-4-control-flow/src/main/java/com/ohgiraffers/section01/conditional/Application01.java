package com.ohgiraffers.section01.conditional;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        A_If aIf = new A_If();
        aIf.testSimpleIfStatenant();


        /*
        <계산기 만들기>
        * 1. calculator 메소드를 만든다.
        public double calculator(){

        }
        * 2. 첫번째 수를 입력받는다.
        * 3. 두번째 수를 입력받는다.
        * 3. 연산 기호를 입력받는다.
        * 4. 연산 기호를 확인한다.
        * 5. 연산을 진행한다.
        * 6. 반환한다.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("값을 입력하세요:");
        double x = sc.nextDouble();
        System.out.println("두번째 값을 입력해라");
        double y = sc.nextDouble();
        System.out.println("+,-,*,/ 중 하나를 선택하세요.");
        char cal = sc.next().charAt(0);

        if(cal == '+'){
            System.out.println(x +" + "+ y+ "="+(x+y));
        }else if (cal =='-'){
            System.out.println(x + "-"+ y +"="+(x-y));
        }else if (cal =='*'){
            System.out.println(x + "*" + y + "=" + (x*y));
        }else if (cal =='/'){
            System.out.println(x + "/" + y + "="+ (x/y));
        }




        }

        }

     /*
     * 계산기 만들기
     * 두 수와 연산기호를 입력받아
     * 수식에 맞는 연산을 수행하는 프로그램을 만들어주세요
     * */



        // 한번에 연산식 입력받기

//split 문자열 분할 " " 띄어쓰기 기준으로 분할
//parsInt 는 문자열을 정수로 전환
// integer  class













