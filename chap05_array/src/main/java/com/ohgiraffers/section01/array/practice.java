package com.ohgiraffers.section01.array;

public class practice {
    public static void main(String[] args) {
        // 총합과 평균 출력   10,20,30,50,3,60,40
         int[] arr= {10,20,30};  //자료형[]<-배열을 쓰겠다
        int sum =0;
        int average =0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];   //?


            average=sum/arr.length;
        }
        System.out.println("총합="+sum+"평균은"+average);
    }
}

