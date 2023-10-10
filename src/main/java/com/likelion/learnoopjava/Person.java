package com.likelion.learnoopjava;

public class Person {
    public String name;
    public String birthday;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Person [Họ tên: " + this.name + ", Ngày sinh: " + this.birthday + "]";
    }
}
