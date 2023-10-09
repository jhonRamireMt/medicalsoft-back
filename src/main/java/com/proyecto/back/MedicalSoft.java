package com.proyecto.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;


@SpringBootApplication
public class MedicalSoft {

	public static void main(String[] args) {
		SpringApplication.run(MedicalSoft.class, args);
	}

}
