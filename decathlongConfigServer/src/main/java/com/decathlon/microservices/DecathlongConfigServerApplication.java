package com.decathlon.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DecathlongConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecathlongConfigServerApplication.class, args);
	}
}
