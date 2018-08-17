package com.cg.spring.springbootmvc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.spring.springbootmvc2")
public class Springbootmvc2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootmvc2Application.class, args);
	}
}
