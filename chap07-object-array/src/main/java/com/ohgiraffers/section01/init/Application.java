package com.ohgiraffers.section01.init;

public class Application {

    public static void main(String[] args) {

        /*
        * 객체배열은 레퍼런스 변수에 대한 배열이다.
        * 생성한 인스턴스도 배열을 이용해서 관리하면
        * 동일한 타입의 여러개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다.
        * 또한 반환값은 여러 인스턴스를 반환해야 하는 경우 객체배열을 이용할 수 있다.
        * */

        Car car1 = new Car("페라리",100);
        Car car2 = new Car("람보르기니",200);
        Car car3 = new Car("롤스로이스",300);
        Car car4 = new Car("부가티베이론",400);
        Car car5 = new Car("포터",500);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        Car[] cars = new Car[5];
        cars[0]  = new Car("페라리",100);
        cars[1]  = new Car("람보르기니",200);
        cars[2]  = new Car("롤스로이스",300);
        cars[3]  = new Car("부가티베이론",400);
        cars[4]  = new Car("포터",500);

        for (int i = 0; i < cars.length; i++) {
            cars[i].driveMaxSpeed();
        }
        for(Car car : cars){
            car = cars[0];
            car.driveMaxSpeed();


        }
    }
}
