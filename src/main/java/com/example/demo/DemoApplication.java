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
		// Logging a simple message
		logger.info("test");

		// Logging a message with extra values, here you have to use the method "v" that will
		// log the values structured. 
		logger.info("another thing, now with extra values", v("amount", 100), v("anotherField", "test"));

		try {
			throw new IllegalArgumentException("Message of wrong args");
		} catch (IllegalArgumentException e) {
			// Logging an exception with extra arguments
			logger.info("another thing, now with extra values", v("test","test"), e);
		}
	}
}
