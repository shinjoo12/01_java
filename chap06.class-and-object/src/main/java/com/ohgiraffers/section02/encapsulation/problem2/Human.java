package com.ohgiraffers.section02.encapsulation.problem2;

public class Human {
    //사람 대여
    private Book books;
    private String humanName;

    public Book getBooks() {
        return books;
    }

    public void setBooks(Book books) {
        this.books = books;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }
}