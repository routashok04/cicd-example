package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdExample1ApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(CicdExample1Application.class);

	@Test
	void contextLoads() {
		logger.info("Testcase executed...");
		assertEquals(true, true);
	}

}
