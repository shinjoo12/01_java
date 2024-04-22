package com.ohgiraffers.section03.copy;

import java.util.concurrent.LinkedTransferQueue;

public class Application01 {

    public static void main(String[] args) {
        //얕은 복사 주소값을 공유한다.
        String[] goldsideName = {"김재석","송재희","황정한"};
        System.out.println(goldsideName[0]);
        String[] names = goldsideName;  //goldsideName->3명의 이름을 갖고있는 주소를 갖고있음
        //goldsideName 이 갖고있는 주소를 names에 넣어주는

        System.out.println(goldsideName);
        System.out.println(names);
        goldsideName[0] ="김효주";   //김재석->김효주 로 초기화 goldsideName의 변수에 값 변경

        System.out.println(goldsideName[0]);
        System.out.println(names[0]);  //얕은 복사
        System.out.println("---------------------");

        //----------------------------------
        //깊은 복사에 대한 개념
        goldsideName =new String[]{"김재석","송재희","황정한"}; //변수명을 새롭게 할당하는 것이 불편해서 임시로 재사용
        //주소값 재할당
        names = new String[3];

        for (int i = 0; i < goldsideName.length; i++) {
            String name = goldsideName[i];
            System.out.println(name);
        }
        //for each   위와 같음
        int i = 0;
        for(String name :goldsideName){
           names[i] = name;    //goldsideName 을 꺼내서 names 인덱스에 할당
           i++;
        }
        goldsideName[0] = "이상우";
        System.out.println(goldsideName[0]);   //이상우
        System.out.println(names[0]);  //김재석


        }


    }

