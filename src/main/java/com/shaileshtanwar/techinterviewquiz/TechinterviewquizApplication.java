package com.shaileshtanwar.techinterviewquiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.shaileshtanwar"})
public class TechinterviewquizApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechinterviewquizApplication.class, args);
	}

}
