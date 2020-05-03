package com.redfox.redfoxsportapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RedFoxApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedFoxApiApplication.class, args);
	}

}
