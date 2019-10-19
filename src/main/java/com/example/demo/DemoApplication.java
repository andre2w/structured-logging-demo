package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import static net.logstash.logback.argument.StructuredArguments.v;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void run(String... args) {
		logger.info("test");
		logger.info("another thing, now with extra values", v("amount", 100), v("anotherField", "test"));

		try {
			throw new IllegalArgumentException("Message of wrong args");
		} catch (IllegalArgumentException e) {
			logger.info("another thing, now with extra values", e);
		}
	}
}
