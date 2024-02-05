package com.ka.matjardiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MatjarDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatjarDiscoveryServerApplication.class, args);
	}

}
