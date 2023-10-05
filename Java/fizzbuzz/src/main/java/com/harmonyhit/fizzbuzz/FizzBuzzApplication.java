package com.harmonyhit.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalTime;

@SpringBootApplication
public class FizzBuzzApplication implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(FizzBuzzApplication.class);
	private final CuckooClock clock = new CuckooClock();

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
	}

	@Override
	public void run(String... args) {
		LocalTime time = LocalTime.now();
		LOGGER.info("Fizz Buzz Test");
		this.clock.cuckooClock(time);
	}
}
