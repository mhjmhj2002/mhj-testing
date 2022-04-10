package com.mhj.testing.mhjtesting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.mhj.testing.mhjtesting.config.DataBaseConfig;
import com.mhj.testing.mhjtesting.config.TestConfig;

import lombok.extern.slf4j.Slf4j;

//@TestPropertySource(properties=
//{"spring.autoconfigure.exclude=comma.seperated.ClassNames,com.mhj.testing.mhjtesting.config.RestTemplateConfig"})
@SpringBootTest()
@Slf4j
@ContextConfiguration(classes = {DataBaseConfig.class, TestConfig.class})
//@EnableAutoConfiguration(exclude=RestTemplateConfig.class)
//@ComponentScan(excludeFilters={@ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE, value=RestTemplateConfig.class)})
class MhjTestingApplicationTests {

	@Test
	void contextLoads() {
		log.info("Iniciando Testes...");
	}

}
