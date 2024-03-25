package com.example.slowstep_pjt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SlowstepPjtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlowstepPjtApplication.class, args);
	}
}
