package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        A_If aIf = new A_If();
        aIf.testSimpleIfStatenant();
    }

    public String calculator() {


//        <계산기 만들기>

//        * 1. calculator 메소드를 만든다.

        //입력 받을 수 있는 기능을 추가한다.
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자 입력: ");

//        * 2. 첫번째 수를 입력받는다.
        int first = sc.nextInt();
        System.out.println("연산기호 입력: ");
        char operator = sc.nextLine().charAt(0);
//        * 3. 두번째 수를 입력받는다.
        System.out.println("두번째 숫자 입력: ");
        int second = sc.nextInt();

//        * 3. 연산 기호를 입력받는다.

//        * 4. 연산 기호를 확인한다.
        int result;
        if (operator == '+') {
            result = first + second;
        } else if (operator == '-') {
            result = first - second;
        } else if (operator == '*') {
            result = first * second;
        } else if (operator == '/') {
            result = first / second;
        } else {
            return "";
        }

        return ""+result;
    }

//        * 5. 연산을 진행한다.
//        * 6. 반환한다.
//        * */

}


