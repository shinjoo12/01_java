package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMonkeyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
    public  void checkenoughMoney(int price,int money) throws PriceNegativeException,MoneyNegativeException,NotEnoughMonkeyException{


        if (price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }

        if (money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }
        if (money < price) {
            throw new NotEnoughMonkeyException("가진 돈 보다 상품 가격이 더 비쌉니다.");
        }
        System.out.println("즐쇼");
    }

    public void checkEnoughMoney(int i, int i1) {
    }
}
