package com.ohgiraffers.section03.abstraction.problem2;

public class Car {

    private boolean isOn;    //isOn 시동껴진상태
    private int speed;

    public void startUp(){ //
        if(isOn){
            System.out.println("이미 시동이 걸려있습니다.");
        }else{
            this.isOn = true;
            System.out.println("시동이 걸렸습니다. 이제 출발할 준비가 되었습니다.");
        }
    }

    public void turnoff(){
        if(this.isOn){
            if(this.speed >0){
                System.out.println("자동차를 멈추고 다시 종료해주세요");
            }else
            this.isOn = false;
            System.out.println("시동을 끕니다.");
        }else{
            System.out.println("이미 시동이 꺼져있는 상태입니다.");
        }
    }

    public void go(){
        if(this.isOn){
            this.speed +=10;
            System.out.println("현재 차의 시속은 " + this.speed + "km/h입니다.");
        }else{
            System.out.println("차의 시동을 걸어주세요");
        }
    }
    public void stop() { //정지된 상태
        if (this.isOn) {
            if (this.speed>0) {

                System.out.println("브레이크를 밟았습니다.");
            }else
                System.out.println("차가 멈춰 있는 상태입니다.");
            }else
                System.out.println("시동이 걸려있지 않습니다");
        }
    }

