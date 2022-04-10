package com.mhj.testing.mhjtesting.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class RestTemplateConfig {
	
	@Bean
	public RestTemplate restTemplate() {
		log.info("Carregando Bean RestTemplate...");
		return new RestTemplate();
	}

}
