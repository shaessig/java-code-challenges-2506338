package com.linkedinlearning.challenges;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder {
	public List<Integer> findPrimeNubersInInterval(int start, int end) {
		List<Integer> result = new ArrayList<>();
		for (int i = start; i <= end ; i++) {
			if (isPrime2(i)) {
				result.add(i);
			}
		}
		return result;
	}

	private boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i < number/2 + 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	private boolean isPrime2(int number) {
		boolean isPrime = true;
		int []arr = { 7, 11, 13, 17,19, 23, 29, 31 };

		// Base Case
		if (number < 2) {
			return false;
		}

		if (number == 2 || number == 3 || number == 5) {
			return true;
		}

		// Check for the number taken
		// as basis
		if (number % 2 == 0
				|| number % 3 == 0
				|| number % 5 == 0) {
			return false;
		}
		// Check for Wheel
		// Here i, acts as the layer
		// of the wheel
		for (int i = 0; i < Math.sqrt(number); i += 30) {
			for (int c: arr) {
				if (c > Math.sqrt(number)) {
					break;
				} else {
					if (number % (c + i) == 0) {
						isPrime = false;
						break;
					}
				}
				if (!isPrime) {
					break;
				}
			}
		}
		return isPrime;
	}
}
