package com.example.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Lvc6SpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lvc6SpringCloudConfigServerApplication.class, args);
	}

}
