package main.java.com.ohgiraffers.section01.method;

public class quiz {
    public static void main(String[] args) {
        //1. myinfo 함수 만들기
       // 2. 매개변수 (String name, int age, char gender,string phone)
        //3.매개 변수 더하기 String result = name+ age + gender+ phone
        //4.return result




        quiz quiz1 = new quiz();
        //int result = app3.plus(x, y);
        //System.out.println(result);

        String info =quiz1.Myinfo("joo",32,'여',"010-1234-5469");
        System.out.println(info);



    }



    public String Myinfo(String name,int age , char gender,String phone ){
        String result1 = name+age+gender+phone;
        return result1;
    }

}
