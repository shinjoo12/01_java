package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        A_If aIf = new A_If();
        aIf.testSimpleIfStatenant();
    }
    public String calculator(){   //접근제어자 반환타입 함수이름 ( ){

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자 입력: ");
        int first = sc.nextInt();

        System.out.println("연산기호 입력: ");
        char operator = sc.nextLine().charAt(0);

        System.out.println("두번째 숫자 입력: ");
        int second = sc.nextInt();

        double result;

        if (operator == '+') {
             result = first + second;
        } else if (operator == '-') {
             result = first - second;
        } else if (operator == '*') {
            result = first * second;
        } else if (operator == '/') {
            result = first / second;
        }else {
            return "연산식 오류";
        }
        return String.valueOf(result);
    }

}
