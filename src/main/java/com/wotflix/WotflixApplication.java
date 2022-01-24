package com.wotflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Annotation to initialize spring boot, the entire app can be launched by the main method
@SpringBootApplication
public class WotflixApplication {



	public static void main(String[] args) {
		SpringApplication.run(WotflixApplication.class, args);
	}

}
