package com.ohgiraffers.section01.user_type;

public class Application01 {
    public static void main(String[] args) {
        String id = "정한1";
        String id2 = "재희";

        String pwd ="pass01";
        String pwd2 ="pass02";

        String name = "황정한";
        String name2 ="송재희";

        int age = 20;
        int age2 =22;

        char gender = '남';
        char gender2 ='여';

        String[] hobby = new String[]{"축구","헬스","런닝"};   //new 는 heap메모리에 동적생성
        String[] hobby2 =new String[]{"걷기","릴스시청","인사동"};

        //------------------------------
        Member hwang = new Member();
        Member song = new Member();

        hwang.id = "정한";   //hwang ->instance
        song.id = "재희";

        hwang.pwd = "pass01";
        song.pwd = "pass01";

        hwang.age = 20;
        song.age = 22;

        hwang.gender ='남';
        song.gender ='여';

        hwang.name ="황정한";
        song.name ="송재희";

        hwang.hobby = new String[]{"축구","헬스","런닝"};
        song.hobby = new String[]{"걷기","릴스시청","인사동"};

        System.out.println(hwang);

    }
}
