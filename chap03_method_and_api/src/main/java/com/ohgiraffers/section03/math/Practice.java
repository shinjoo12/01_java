package main.java.com.ohgiraffers.section03.math;

import java.sql.SQLOutput;

public class Practice {
    public static void main(String[] args) {


        Practice dog = new Practice();

        int result = dog.cat(3);  //cat에 3을 넣어서 출력
        System.out.println(result);

    }

    public int cat(int x){
        //int x;
        //x = 3;
        int y = x+x;
        return y;

    }
}
