package com.codingdojo.strings.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}

	@RequestMapping("/")
	public String hello(){
		return "hello world!";
	}

	@RequestMapping("/random")
	public String randomHello(){
		String[] stringArr = {"Hello Client. How are you", "Buenos dias client. how is your day", "Welcome Client. care for a drink?"};
		return stringArr[(int)(Math.random() * 3)];
	}

}
