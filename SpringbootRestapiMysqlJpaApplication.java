package com.mycom.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRestapiMysqlJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestapiMysqlJpaApplication.class, args);
		System.out.println("SpringBoot DataJPA Server Started..");
	}

}
