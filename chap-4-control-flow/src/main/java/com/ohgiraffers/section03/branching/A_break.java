package com.ohgiraffers.section03.branching;

public class A_break {

    /*
    * break문 실행 흐름을 확인하기 위한 용도의 기능을 제공. 분기문(break) 기본 흐름에 대해 확인
    *
    * */
    public void testSimpleBreakStatement(){
        int i = 2;
        test:   //-> while 이름 붙여줌
        while(true){  //참일때 실행 (종료x)
            int x =0;

            while (x<=9){

                if(i>=10){
                 break test;  //test 종료시킴 10까지만 실행
            }
                if(x>=5){   //라벨 없는 break는 실행하고있는 스코프 종료
                    break;
                }
                if(x==0){
                    x++;
                    continue;  //->다음 실행x
                }
                System.out.println(i+ "*"+ x + "="+ i*x);
                x++;
            }
            i++;
        } //while문 종료
    }//testSimpleBreakStatement 종료
}
