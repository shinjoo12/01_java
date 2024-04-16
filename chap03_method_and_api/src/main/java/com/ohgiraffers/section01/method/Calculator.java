package main.java.com.ohgiraffers.section01.method;

public class Calculator {
    public int minNumberOf(int first , int second){

        return(first<second) ? first : second;
    }

    public static int maxNumberOf(int first , int second){

        return(first < second)? second : first;
    }
}


//static 정적인영역(변경되지 않는)
