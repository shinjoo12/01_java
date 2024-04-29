package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.DrunkenBunny;
import com.ohgiraffers.section02.extend.Mammal;
import com.ohgiraffers.section02.extend.Rabbit;
import com.ohgiraffers.section02.extend.RabbitFarm;

public class Application01 {

    public static void main(String[] args){
        //기준 <T extends Rabbit>을 기준으로
       // animal 클래스는 Rabbit 의 조상타입으로 타입이 맞지 않음
      //  RabbitFarm<Animal>farm1 = new RabbitFarm<Animal>();
        //Marmal 클래스는 Rabbit 의 부모타입으로 타입이 맞지 않는다.
      //  RabbitFarm<Mammal>farm2 = new RabbitFarm<Mammal>();

        //Snake는 Rabbit과 관련이 없는 타입으로 타입이 맞지 않는다.
       // RabbitFarm<Snake>farm3 = new RabbitFarm<Snake>();

        //Rabbit 은 Rabbit 과 같은 타입으로 제네릭스 타입의 지정이 가능하다.
        RabbitFarm<Rabbit>farm4 = new RabbitFarm<>(new Rabbit());

        farm4.getAnimal().cry();
        //Bunny는 Rabbit의 자식 타입으로 제네릭스 타입의 지정이 가능하다.
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        farm5.getAnimal(new )
        farm5.getAnimal().cry();
        //DrunkenBunny는 Rabbit 의 증손타입으로 제네릭스 타입 지정이 가능하다.
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();
        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();
    }
}
