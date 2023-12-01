package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiamondTest {
	@Test
	void testDiamondA() {
		var expected = "A";
		var actual = new Diamond('A').renderDiamond();
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testDiamondB() {
		var expected = """
				 A
				B B
				 A""";
		var actual = new Diamond('B').renderDiamond();
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testDiamondD() {
		var expected = """
				   A
				  B B
				 C   C
				D     D
				 C   C
				  B B
				   A""";
		var actual = new Diamond('D').renderDiamond();
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void testDiamondE() {
		var expected = """
				    A
				   B B
				  C   C
				 D     D
				E       E
				 D     D
				  C   C
				   B B
				    A""";
		var actual = new Diamond('E').renderDiamond();
		Assertions.assertEquals(expected, actual);
		System.out.println(new Diamond('Z').renderDiamond());
	}
}
