package com.harmonyhit.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;

@SpringBootTest
class FizzBuzzApplicationTests {
	private final CuckooClock cuckooClock = new CuckooClock();


	@Test
	void contextLoads() {
	}

	@Test
	void testFizz() {
		LocalTime time = LocalTime.of(1, 9);

		String result = this.cuckooClock.cuckooClock(time);

		Assertions.assertEquals("Fizz", result);
	}

	@Test
	void testBuzz() {
		LocalTime time = LocalTime.of(3, 10);

		String result = this.cuckooClock.cuckooClock(time);

		Assertions.assertEquals("Buzz", result);
	}

	@Test
	void testFizzBuzz() {
		LocalTime time = LocalTime.of(10, 30);

		String result = this.cuckooClock.cuckooClock(time);

		Assertions.assertEquals("Fizz Buzz", result);
	}
}
