package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DemoApplicationTests {

	Logger log = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("Test case executing  ...");

	}

}
