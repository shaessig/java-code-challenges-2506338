package com.linkedinlearning.challenges;

import java.util.Arrays;

public class StringCalculator {
	public static int add(String numbers) {
		return Arrays.stream(numbers.split(","))
				.map(String::trim)
				.filter(p -> !p.isEmpty())
				.mapToInt(Integer::parseInt)
				.sum();
	}
}
