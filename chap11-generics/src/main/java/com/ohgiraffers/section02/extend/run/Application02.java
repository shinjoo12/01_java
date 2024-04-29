package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

import javax.management.DescriptorRead;

public class Application02 {
    public static void main(String[] args) {
        /*
        * 와일드카드(wildCard)
        * 제네릭스 클래스 타입의 객체를 메소드의 매개변수로 받을 때.
        * 그 객체의 차입 변수를 제한 할 수 있다.
        * <?>:제한 없음
        * <? extends Type> : 와일드카드의 상한 제한 (type과 type의 후손을 이용해서 생성한 인스턴스만 인자로 사용 가능)
        * <? super Type> : 와일드카드 하한 제한 (Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용가능)
        * */

    WildCardFarm wildCardFarm = new WildCardFarm();
    //농장 생성 자체가 불가능한 것은 매개변수로 사용할 수없다.
   // wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal)));
    //wildCarFarm.anyType(new RabbitFarm<Reptile>(new Reptile()));

    //그래서 아래와 같이 RabbitFarm 의 생성 조건을 만족한다면 anyType의 조건을 만족하게 되는 것이다.
    wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
    wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
    wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

   //RabbitFarm 을 생성하는 부분에는 문제가 없다. 그러나 extendsType의 매개변수 조건을 확인하면<? extends Bunny가 있으며
    //이것으로 아래의 Rabbit은 매개변수의 조건을 위배하게 된다.
   //wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
    wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
    wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

    wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
    wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
    //아래는 RabbitFarm의 조건은 만족하지만 SuperType의 조건은 만족하지 않는다.
        //superType의 매개변수 조건은 bunny 의 조상만 허용하기 때문이다.
    //wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));


}
}