package com.example.slowstep_pjt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SlowstepPjtApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Test
	void contextLoads() {

		try {

			System.out.println(">>> debug");
			System.out.println(context.getBean("encore"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
