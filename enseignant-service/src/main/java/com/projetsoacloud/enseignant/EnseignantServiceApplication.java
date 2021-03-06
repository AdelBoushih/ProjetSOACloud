package com.projetsoacloud.enseignant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EnseignantServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnseignantServiceApplication.class, args);
	}

}
