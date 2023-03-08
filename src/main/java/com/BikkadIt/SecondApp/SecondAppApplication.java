package com.BikkadIt.SecondApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.BikkadIt.SecondApp","in.bikkadIt.SecondApp"})
public class SecondAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondAppApplication.class, args);
		System.out.println("Sprint boot first application");
	}

}
