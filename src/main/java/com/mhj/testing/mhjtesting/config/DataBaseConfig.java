package com.mhj.testing.mhjtesting.config;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class DataBaseConfig {
	
	   @Bean(initMethod = "start", destroyMethod = "stop")
	    public Server h2Server() throws SQLException {
		   log.info("Carregando Bean H2...");
	        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092");
	    }

}
