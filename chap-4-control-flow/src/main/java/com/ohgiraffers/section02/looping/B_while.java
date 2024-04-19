package com.ohgiraffers.section02.looping;

public class B_while {
    public void testSimpleWhileStatement(){

        /*
        * [while문 표현식]
        * 초기식;
        * while(조건식){
        * 조건식을 만족하는 경우 수행할 구문(반복할 구문);
        * 증감식;
        * }
        *
        * while(조건식){
        * 조건식을 만족하는 경우 수행할 구문
        * }
        * */

        int i = 2;
        int j = 1;
        while(i <= 9){  //반복해야 하는 대상의 길이를 알 수 없을 때 사용한다. // 시작
            while(j <= 9){ // 시작
                System.out.println(i+ "x" + j+"="+(i*j));
                j++;
            } // 끝
                i++; // 3
                j=1;
        }//끝

        /*while문을 이용하여 구구단 만들기
        //1.초기식 작성
        int i =2;
        //2.while 문의 조건식
        while (i<=9){  //while 시작
        }
        //3.중첩 while 조건식
        while(j<=9){
        //4.i * j 연산
            System.out.println(i + "x" + j =);
        //5.출력
        //6.중첩 while 증감식
        j++;
        //7.while 증감식
        i++;
        */


    }
}
