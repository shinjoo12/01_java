package com.ohgiraffers.section01.conditional;

public class A_If {
    public void testSimpleIfStatenant(){
        /*
        * [If 표현식]
        * if(조건식){
        * 조건식이 참인 경우에 실행할 명령문
        * }
        *
        * 조건식 : true or false 가 나오는 연산식을 의미한다.
        *
        * */

        int num = 10;

        if (num % 2 == 0){
            System.out.println(num+"은 2의 배수입니다.");
        }else{
            System.out.println(num+ "은 2의 배수가 아닙니다.");
        }
    }
}
