package com.ohgiraffers.section04.dto;

import java.util.Date;

public class UserDTO {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date endrollDate;   //Date ->날짜를 관리하기 위한 날짜타입

    //접근제어자 클래스명(){}
    //기본 생성자
    public UserDTO(){}

    //전체 필드를 초기화 하는 생성자
    public UserDTO(String id,String pwd,String name,java.util.Date endrollDate){
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.endrollDate = endrollDate;
    }
    public String getid(){
        return id;
    }
    public void setid(String id){
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEndrollDate() {
        return endrollDate;
    }

    public void setEndrollDate(Date endrollDate) {
        this.endrollDate = endrollDate;
    }

   /* @Override // 어노테이션  / Override->Object가 가지고 있는 것을 재정의 //클래스는 object의 자식
    public String toString(){
        return "안녕";*/

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", endrollDate=" + endrollDate +
                '}';
    }
}
