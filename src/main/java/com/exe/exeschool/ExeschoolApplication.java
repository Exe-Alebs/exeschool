package com.exe.exeschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EntityScan(basePackages = "com.exe.exeschool.Data")
public class ExeschoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExeschoolApplication.class, args);
	}

}
