package com.mhj.testing.mhjtesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class MhjTestingApplication {

	public static void main(String[] args) {
		log.info("Iniciando APP...");
		SpringApplication.run(MhjTestingApplication.class, args);
	}

}
