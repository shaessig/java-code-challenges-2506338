package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PrimeNumberFinderTest {

	@Test
	void testPrimeNumbers() {
		var sot = new PrimeNumberFinder();
		var actual = sot.findPrimeNubersInInterval(10, 20);
		var expected = List.of(11, 13, 17, 19);
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testPrimeNumbers1() {
		var sot = new PrimeNumberFinder();
		var actual = sot.findPrimeNubersInInterval(10, 19);
		var expected = List.of(11, 13, 17, 19);
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testPrimeNumbers2() {
		var sot = new PrimeNumberFinder();
		var actual = sot.findPrimeNubersInInterval(19, 19);
		var expected = List.of(19);
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testPrimeNumbers3() {
		var sot = new PrimeNumberFinder();
		var actual = sot.findPrimeNubersInInterval(2, 10000).size();
		var expected = 1229;
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testPrimeNumbers4() {
		var sot = new PrimeNumberFinder();
		var actual = sot.findPrimeNubersInInterval(2, 10_000_000).size();
		var expected = 664_579;
		Assertions.assertEquals(expected, actual);
	}
}

