package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

	@Test
	void testCalc1() {
		Assertions.assertEquals(3, StringCalculator.add("1,2"));
		Assertions.assertEquals(3, StringCalculator.add("01, 2"));
		Assertions.assertEquals(2, StringCalculator.add("2"));
	}

	@Test
	void testCalc2() {
		Assertions.assertEquals(1, StringCalculator.add("-1,2"));
		Assertions.assertEquals(-3, StringCalculator.add("-01, -2"));
		Assertions.assertEquals(-2, StringCalculator.add("-2"));
	}

	@Test
	void testCalc3() {
		Assertions.assertEquals(398, StringCalculator.add("-1,2,-3,400"));
		Assertions.assertEquals(147, StringCalculator.add("-01, -2,3,4,5,6 ,7,8,9,10,11,12,13  , 14, 15 , 16 , 17"));
	}

	@Test
	void testCalcEmpty() {
		Assertions.assertEquals(0, StringCalculator.add(""));
	}

}
