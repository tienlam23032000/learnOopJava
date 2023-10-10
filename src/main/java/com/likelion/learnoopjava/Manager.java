package com.likelion.learnoopjava;

public class Manager extends Employee{
    public String assistant;

    public Manager(String name, String birthday, double salary, String assistant) {
        super(name, birthday, salary);
        this.assistant = assistant;
    }

    // Setter cho thuộc tính directManager
    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }
    @Override
    public String toString(){
        return "Manager [Họ tên: " + this.name + ", Ngày sinh: " + this.birthday + ", Lương: " + this.salary + ", Trợ lý: " + assistant + "]";
    }
}
