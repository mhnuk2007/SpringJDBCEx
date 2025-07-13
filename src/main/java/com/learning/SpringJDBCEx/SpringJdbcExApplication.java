package com.learning.SpringJDBCEx;

import com.learning.SpringJDBCEx.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s = context.getBean( Student.class);
		s.setId(101);
		s.setName("Honey");
		s.setMarks(99);

		System.out.println(s);
	}

}
