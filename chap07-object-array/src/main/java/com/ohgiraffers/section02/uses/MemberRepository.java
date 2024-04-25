package com.ohgiraffers.section02.uses;

public class MemberRepository {
    private final static Member[] members;
    private static int count;       //static 변하지 않는 정적함수

    static{
        members = new Member[10];
    }

    public static boolean store(Member[] newMembers) {
        for (int i = 0; i < newMembers.length; i++) {
            members[count++] = newMembers[i];      //members 에 count 만큼 증가
        }
        return true;
    }
    public static Member[] findAllMembers(){
        return members;
    }
}
