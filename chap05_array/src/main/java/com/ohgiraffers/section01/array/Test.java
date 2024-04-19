package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Test {
    public void avg() {



        /*
         * A학생의 평균 점수를 구하는 프로그램을 만들어주세요
         * 시험의 과목은 5개로 점수는 정수 단위입니다.
         * 5개의 과목의 점수를 입력받고 평균을 구하여 화면에 출력합니다
         * 예) A학생의 수학: 90점, 영어:80점, 국어:100점 , 과학:79점,사회:80점이며 평균은 X입니다.
         *
         * */

        Scanner sc = new Scanner(System.in);
        //과목 5개 점수 입력받기
        int[] score = new int[5];  //5과목
        int result = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            result += score[i];
        }
        double avg = result / score.length;

        String[] subject ={"수학","영어","국어","과학","사회"};


        for (int i = 0; i < score.length; i++) {
            System.out.print(subject[i] + ":"+ score[i] + " ");

        }
        System.out.println(avg);






        // 평균 = 합계 / 과목 수



        }

    }

