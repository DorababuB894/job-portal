package com.mine.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mine")
public class SpringbootJobProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJobProjectApplication.class, args);
	}

}
