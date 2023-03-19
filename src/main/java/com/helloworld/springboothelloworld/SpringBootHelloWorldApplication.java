package com.helloworld.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

	@GetMapping("/")
	public String hello(){
		return "hello world";
	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam("q") String greet){
		return "Hello "+ greet;
	}

	@GetMapping("/welcome/{greet}")
	public String welcome(@PathVariable String greet){
		return "Welcome "+greet;
	}

}
