package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args){
        Book[] book = new Book[3];    //book이라는 클래스의 묶음/ Book[3] 책 3개를 가질수있는
        book[0].bookName ="점프투 파이썬";
        book[1].bookName = "자바";
        book[2].bookName = "어린왕자";   //3개의 책 정의

        book[0].author = "shinjoo";
        book[1].author = "jooyeon";
        book[2].author = "joooo";

        book[0].bookNumber =3;
        book[1].bookNumber =4;
        book[2].bookNumber =5;

        Human shin = new Human();
      //  shin.books = book[0];
       // shin.humanName = "ddd";




    }

}
