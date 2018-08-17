/*************************************************************************************************************
 *
 * purpose:To create an eureka server for micro services
 * 
 * @author sowjanya467
 * @version 1.0
 * @since 1-08-18
 *
 **************************************************************************************************/package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServerToDoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerToDoApplication.class, args);
	}
}
