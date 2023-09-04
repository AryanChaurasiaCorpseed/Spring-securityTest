package com.example.demo;

import org.springframework.boot.SpringApplication;


//https://www.bezkoder.com/spring-boot-jwt-authentication/
// new documentation added 
//https://www.youtube.com/watch?v=kn5h-GTjDY0&list=PLSVW22jAG8pBnhAdq9S8BpLnZ0_jVBj0c&index=6
	
	
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringSecurityTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityTestApplication.class, args);
	}

}
