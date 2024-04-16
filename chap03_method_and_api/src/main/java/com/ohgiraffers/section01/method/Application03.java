package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        Application03 app3 = new Application03();
        int result = app3.plus(x, y);
        System.out.println(result);


        int result1 = app3.minus(x, y);
        System.out.println(result1);


        int result2 = app3.multi(x, y);
        System.out.println(result2);


        int result3 = app3.division(x,y);
        System.out.println(result3);
    }

    // 두 수를 더하기 함수
    //1.접근제어자 2.반환타입 3.함수명(매개변수){} 스코프필요
    public int plus(int x, int y) {
        int result = x + y;
        return result;
    }
    public int minus(int x,int y) {
        int result1 = x - y;
        return result1;
    }
    public int multi ( int x, int y) {
        int result2 = x * y;
        return result2;
    }

    public int division (int x , int y){
        int result3 = x / y;
        return result3;
        }
    }


