package com.Activity401.Activity401;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages="com.controller,com.service")
@EntityScan("com.model")
@EnableJpaRepositories("com.dao")
public class Activity401Application {

	public static void main(String[] args) {
		SpringApplication.run(Activity401Application.class, args);
	}

}