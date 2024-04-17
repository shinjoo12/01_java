package main.java.com.ohgiraffers.section01.method;

import org.w3c.dom.ls.LSOutput;

public class Application01 {

    public static void main(String[] args) {
        /*
        * 메소드
        * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        *
        * */
        System.out.println("main() 시작됨...");

        Application01 app1 = new Application01();   //application1을 만들어서 app1에 넣어줌
        app1.methodA();
        //app1.main();

        System.out.println("main() 종료함");

    }

    //public->접근제어자    return(반환) 되는 값 없으면 void//methodA->메소드이름
    public void methodA(){
        System.out.println("methodA() 시작됨");
        methodB();
        System.out.println("methodA()를 호출함");

    }

    public void methodB() {
        System.out.println("methodB()를 시작함");
        System.out.println("methodB()를 종료됨");

    }

}
