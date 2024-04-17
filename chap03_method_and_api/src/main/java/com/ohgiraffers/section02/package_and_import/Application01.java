package main.java.com.ohgiraffers.section02.package_and_import;

//import 불러오기
import  main.java.com.ohgiraffers.section01.method.Calculator;
import static main.java.com.ohgiraffers.section01.method.Calculator.maxNumberOf;
// import static-> static 메모리에 올라와있는것을 불러오기
public class Application01 {
    public static void main(String[] args) {
        int first = 200;
        int second = 300;
        Calculator cal = new Calculator();

        int max = maxNumberOf(first,second);
        int min = cal.minNumberOf(second,first);
    }
}
