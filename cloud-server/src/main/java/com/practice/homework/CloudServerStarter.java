package com.practice.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class CloudServerStarter {
	public static void main(String[] args){
		SpringApplication.run(CloudServerStarter.class,args);
	}
}
