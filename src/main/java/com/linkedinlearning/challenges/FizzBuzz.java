package com.linkedinlearning.challenges;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

	public String renderFizzBuzz(int max) {
		return IntStream.range(1, max + 1)
				.mapToObj(this::fizzBuzz)
				.collect(Collectors.joining("\n"));
	}

	private String fizzBuzz(int number) {
		if (number % 5 == 0 && number % 3 == 0) {
			return "FizzBuzz";
		} else if (number % 5 == 0) {
			return "Buzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		}
		return Integer.toString(number);
	}
}
