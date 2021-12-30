package com.practice.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class CloudSystemProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(CloudSystemProviderStarter.class,args);
	}
}
