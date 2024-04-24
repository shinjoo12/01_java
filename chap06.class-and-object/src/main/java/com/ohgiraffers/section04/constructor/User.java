package com.ohgiraffers.section04.constructor;

public class User {

    private String name;
    private int age;
    private String phone;

    public User(){

    }

    //생성
    public User(String name, int age, String phone) { //매개변수 가진 생성자
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
