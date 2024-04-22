package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;    //전역변수(int hp)

    //    //monster의 hp가 0보다 큰 값만 입력될 수 있도록 하여 버그를 막고자함
    public void sethp(int hp) { //setHp 시작      //지역변수(int hp)
        if(hp > 0){
            this.hp = hp;   //this -> 예약어 (내가 위치한 주소)/클래스 내부속성/몬스터 클래스의 int hp를 말함
         }else{
            System.out.println("몬스터의 체력은 0보다 작을 수 없습니다.");
        }

    }//setHp 종료

//    public int getHp(){
//        return this.hp;

}

