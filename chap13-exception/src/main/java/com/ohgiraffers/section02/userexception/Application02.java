package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMonkeyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        /*
        * scanner 는 시스템에서 입력을 받을 수 있는 기능을 수행한다.
        * 그러나 이러한 기능은 애플리케이션
        * */
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("제품 가격을 입력해주세요");
            int price = sc.nextInt();
            System.out.println("가진 돈을 입력해주세요");
            int money = sc.nextInt();

            et.checkEnoughMoney(price,money);



    }catch (PriceNegativeException e){
            System.out.println("PriceNegativeException 가 발생함");
    }catch (MoneyNegativeException e){
           System.out.println("MoneyNegativeException 발생함");
       }catch (NotEnoughMonkeyException e){
           System.out.println("NotEnoughMonkeyException 발생함");
       }finally{
           System.out.println("오류가 나던 말던 나는 나의 길을 간다");
       }

        //확장 문법
        try(Scanner sc2 = new Scanner(System.in))
        System.out.println("즐쇼");
}
}