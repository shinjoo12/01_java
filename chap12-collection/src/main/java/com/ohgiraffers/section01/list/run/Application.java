package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        ArrayList alist = new ArrayList();

        List list = new ArrayList();
        List<String> stringList = new ArrayList<>();

        Collection clist = new ArrayList();

        alist.add("apple");
        alist.add(123);
        alist.add(45.332);


        System.out.println(alist);

        //list의 길이를 확인할때 size를 이용한다.
        System.out.println(alist.size());


        for (int i = 0; i < alist.size(); i++) {
            //특정 인덱스의 값을 꺼내온다.
            System.out.println(alist.get(i));
        }

        System.out.println("변경 테스트");
        String targer =(String) alist.get(0);
        targer= "안녕";

        //특정 인덱스의 값을 추가한다.
        alist.add(0,targer);
        System.out.println(alist.get(0));

        System.out.println();
        System.out.println("삭제 구분");
        //특정 인덱스의 값을 제거한다.
        alist.remove(0);
        for (int i = 0; i < alist.size(); i++) {
            //특정 인덱스의 값을 꺼내온다.
            System.out.println(alist.get(i));
        }

        System.out.println();
        //값을 수정한다.
        alist.set(0,"이것을 수정함");
        for (int i = 0; i < alist.size(); i++) {
            //특정 인덱스의 값을 꺼내온다.
            System.out.println(alist.get(i));
        }

        List<String> StringList = new ArrayList<>();
        StringList.add("apple");
        StringList.add("orange");
        StringList.add("mango");
        StringList.add("grape");
        System.out.println();
        System.out.println(StringList);

        Collections.sort(StringList);  //원본 배열 영향을 줌(알파벳 첫글자 순서대로변경)
        System.out.println(StringList);

         stringList = new LinkedList<>(stringList);
        /*
        * Iterator란?
        * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
        * 컬렉션에서 값을 읽어오는 방식을 동일한 방식으로 제공하기 위해 사용된다.
        * 반복자 라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내오는 방식으로 사용하기 위함이다.
        * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
        * 인덱스를 사용하지 않고 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다
        * hasNext(): 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는 경우 false를 변환
        * next :다음 요소를 반환
        * */

        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();

//        while(dIter.hasNext()){
//            System.out.println(dIter.next());
//        }
//        System.out.println(dIter.next());

        List<String> descList = new ArrayList<>();
        while(dIter.hasNext()){
            descList.add(dIter.next());

        }
        for (int i = 0; i < descList.size(); i++) {
            System.out.println(descList.get(i));

        }
    }
}
