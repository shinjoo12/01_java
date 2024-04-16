package main.java.com.ohgiraffers.section01.method;

public class Application04 {
    public static void main(String[] args) {

        int first = 100;
        int second =50;
        Calculator cal = new Calculator();       //new 메모리에 올리기
        int min = cal.minNumberOf(first,second);
        System.out.println(min);

        int max = cal.maxNumberOf(first,second);
        System.out.println(max);
    }
}
