package main.java.com.ohgiraffers.section04.scanner;

// Scanner -> class  사용자 정의타입 //java ->package
import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        //sc ->변수명== 메모리 주소==값
        Scanner sc = new Scanner(System.in);


//        System.out.print("당신의 이름을 입력해주세요: ");
//        String name = sc.nextLine();         //nextline 무조건 문자열로 받음
//        System.out.println("입력하신 당신의 이름은 " + name + "입니다");
//
//        System.out.println("당신의 나이를 입력해주세요: ");
//        int age =sc.nextInt();
//        System.out.println("당신의 나이는 "+age+ "세 입니다");


        Application01 app1 = new Application01();


        String Info = app1.InputInfo();
        System.out.println(Info);

    }
    /*
    *
    * InputInfo메소드를 만들고
    * 사용자의 이름 키 성별 나이를 입력받아 main에서 출력해주세요
    * 1. InputInfo 함수 만들기!
    * 접근제어자 반환타입(String) 메서드명(){}
    * 2. 사용자에게 값을 입력받는다.
    * Scanner sc =new Scanner();
    * 3. 키,나이,성별,이름을 입력받아 문자열로 합친다.
    * double 키;
    * int 나이;
    * char 성별;
    * 문자열 이름:
    * 4. 문자열로 반환한다.
    * return
    * */


    public String InputInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 키는 몇인가요? ");
        double height = sc.nextDouble();

        System.out.println("당신의 나이는 몇살인가요?");
        int age =sc.nextInt();
        sc.nextLine();

        System.out.println("당신의 성별은?");
        char gender = sc.nextLine().charAt(0);

        System.out.println("당신의 이름은?");
        String name = sc.nextLine();


        return "당신의 이름은 " + name + "입니다. \n 당신의 나이는" +age+ "세 입니다.\n 당신의 키는"
+height +"입니다 \n"+"당신의 성별은"+gender+"입니다";    }
}
