package com.ohgiraffers.section02.uses;

public class MemberService {
    public void signUpMembers(){

        Member[] members = new Member[5];

        members[0] = new Member("user01",1,"pass01","홍길동",20,'남');
        members[1] = new Member("user02",2,"pass02","유관순",16,'여');
        members[2] = new Member("user03",3,"pass03","이순신",40,'남');
        members[3] = new Member("user04",4,"pass04","신사임당",36,'여');
        members[4] = new Member("user05",5,"pass05","윤봉길",22,'남');

        MemberRegister memberRegister = new MemberRegister();   //레지스터 클래스 만듬
        memberRegister.regist(members);    //레지스터 클래스 호출
        //리턴문 생략된 상태
    }



    public void showAllMembers() {
        MemberFinder finder = new MemberFinder();
        System.out.println("----------가입된 회원 목록---------");
        for(Member member: finder.findAllMembers()){
            if(member != null){
                System.out.println(member);
            }
        }
        System.out.println("----------------------------");
    }
}
