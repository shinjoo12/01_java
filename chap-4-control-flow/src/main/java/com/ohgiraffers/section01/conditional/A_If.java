package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_If {
    public void testSimpleIfStatenant() {
//        /*
//         * [If 표현식]
//         * if(조건식){
//         * 조건식이 참인 경우에 실행할 명령문
//         * }
//         *
//         * 조건식 : true or false 가 나오는 연산식을 의미한다.
//         *
//         * */
       Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력해주세요: ");

        int num =sc.nextInt();
        sc.nextLine();
////////        //2의 배수면 n은 2의 배수입니다.
////////        //0이면 n은 0입니다.
////////        //2의 배수가 아니면 n은 2의 배수가 아닙니다.
////////
            int n = 0;

        if(n == 2){
          System.out.println("n은 2의 배수입니다.");
        }else{
            System.out.println("n은 2의 배수가 아닙니다.");
//////
       }
//////
//////
         //  int num = 10;

       if (num % 2 == 0){
            System.out.println(num+"은 2의 배수가 아닙니다.+ with if");
        }else{
            System.out.println(num+ "은 2의 배수입니다. with else");
        }
    }
}
