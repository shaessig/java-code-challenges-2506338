package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

	@Test
	void testFibonacci0 () {
		Assertions.assertEquals(0, Diamond.Fibonacci.fibonacci(0));
		Assertions.assertEquals(1, Diamond.Fibonacci.fibonacci(1));
	}

	@Test
	void testFibonacci1 () {
		Assertions.assertEquals(144, Diamond.Fibonacci.fibonacci(12));
		Assertions.assertEquals(1, Diamond.Fibonacci.fibonacci(2));
	}

	@Test
	void testFibonacci50 () {
		Assertions.assertEquals(12_586_269_025L, Diamond.Fibonacci.fibonacci(50));
		Assertions.assertEquals(1, Diamond.Fibonacci.fibonacci(2));
	}

	@Test
	void testFibonacci2_0 () {
		Assertions.assertEquals(0, Diamond.Fibonacci.fibo2(0));
		Assertions.assertEquals(1, Diamond.Fibonacci.fibo2(1));
	}

	@Test
	void testFibonacci2_1 () {
		Assertions.assertEquals(144, Diamond.Fibonacci.fibo2(12));
		Assertions.assertEquals(1, Diamond.Fibonacci.fibo2(2));
	}

	@Test
	void testFibonacci2_50 () {
		Assertions.assertEquals(12_586_269_025L, Diamond.Fibonacci.fibo2(50));
		Assertions.assertEquals(1, Diamond.Fibonacci.fibo2(2));
	}
}
