package com.ohgiraffers.section01.conditional;

import java.util.Scanner;
//등급 계산기 프로그램 if 사용
//main에서 학생의 성적을 입력받고 아래의 메소드에서 학생의 등급을 화면에 출력해주세요
// 100 = a+
// 100~90 = a
// 90~85 = b+
// 85~75 = b
// 75~60 = c
// 0~60 = d
// F는 없다.

// 1. 학생의 성적을 입력받는다.
//2. 입력받은 성적을 매개변수로 전달한다

public class quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력하세요");
        int score = sc.nextInt();
        quiz2 qq = new quiz2();
        qq.grade(score);



    }
     //1.메서드를 만든다.
     //2. 점수의 범위를 구분한다
     //3. 출력한다
        public void grade(int score) {

        String grade;
        grade ="a+";
            if (score == 100) {
                System.out.println(score + "= a+"+"등급");
            } else if (score<= 90 && score < 100) {
                System.out.println(score + "= a"+"등급");
            } else if (score <= 85  && score < 90) {
                System.out.println(score + "= b+"+"등급");
            } else if (score <= 75  && score < 85) {
                System.out.println(score + "=b"+"등급");
            } else if (score <= 60 && score < 75) {
                System.out.println(score + "=c"+"등급");
            } else if(score > 0 && score < 60) {
                System.out.println(score + "=d"+"등급");
            }



        }

}
// 계산기를 만들고 결과를 반환합니다. (switch를 이용함) 반환된 결과는 application02에서 출력해주세요
// + - / * 만 제공하고 일치하는 연산이 없는 경우 연산불가라는 결과를 출력하고 반환 값을 0.0 으로 합니다.
