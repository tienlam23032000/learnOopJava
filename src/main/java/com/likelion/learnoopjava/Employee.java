package com.likelion.learnoopjava;

public class Employee extends Person {
    public double salary;

    public Employee(String name, String birthday, double salary) {
        super(name, birthday);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    @Override
    public String toString(){
        return "Employee [Họ tên: " + this.name + ", Ngày sinh: " + this.birthday + ", Lương: " + this.salary + "]";
    }
}
