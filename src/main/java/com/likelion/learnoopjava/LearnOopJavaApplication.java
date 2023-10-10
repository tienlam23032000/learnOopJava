package com.likelion.learnoopjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnOopJavaApplication {
	public static void main(String[] args) {
		SpringApplication.run(LearnOopJavaApplication.class, args);

		Person ps = new Person("T là Boss","T không cần phải báo cáo ngày sinh");
		Employee epl1 = new Employee("Sa Thị Thải","Không quan tâm",0);
		Employee epl2 = new Employee("Nguyễn Tiến Lam","23/03",1000);
		Manager mng = new Manager("Nguyễn Thanh Hằng", "14/04/2000", 2000, "Sa Thị Thải ");
		mng.setAssistant("Nguyễn Tiến Lam");

		// Tạo mảng Person
		Person[] people = new Person[]{ps, epl1, epl2, mng};

		// Sử dụng vòng lặp để in ra thông tin của các đối tượng trong mảng
		for (Person person : people) {
			System.out.println(person.toString());
		}
	}
}
