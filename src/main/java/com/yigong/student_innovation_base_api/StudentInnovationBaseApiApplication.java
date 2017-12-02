package com.yigong.student_innovation_base_api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yigong.student_innovation_base_api.mapper")
public class StudentInnovationBaseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentInnovationBaseApiApplication.class, args);
	}
}
