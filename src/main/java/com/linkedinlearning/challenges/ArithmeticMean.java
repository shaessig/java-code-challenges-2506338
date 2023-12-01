package com.linkedinlearning.challenges;

import java.util.Collection;
import java.util.Objects;

public class ArithmeticMean {
	public static double mean (Collection<Integer> numbers) {
		return numbers.stream()
				.filter(Objects::nonNull)
				.mapToInt(Integer::intValue)
				.average()
				.orElseThrow();
	}
}
