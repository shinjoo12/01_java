package com.ohgiraffers.section03.dto;

public class Application01 {

    public static void main(String[] args) {
        MemberDTO  song = new MemberDTO();
        song.setAge(20);
        song.setAddress("인사동");
        song.setGender('여');
        song.setPhone("010-1234-5678");
        song.setName("송재희");

         MemberDTO kim = new MemberDTO();
         kim.setName("김재석");
         kim.setAge(19);
         kim.setGender('남');
         kim.setAddress("고잔동");
         kim.setPhone("010-1434-5678");

         MemberRepository memberRepository = new MemberRepository();
         memberRepository.addMember(song);
        memberRepository.addMember(kim);
        memberRepository.print();
    }
}
