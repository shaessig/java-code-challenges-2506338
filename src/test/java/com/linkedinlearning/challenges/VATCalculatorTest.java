package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VATCalculatorTest {

	@Test
	void testRenderInvoice() {
		var calc = new VATCalculator(0.077, "CHF");
		var price = 100.00;
		var expected = """
				Netto: 100.00 CHF
				VAT (0.077): 7.70 CHF
				Total: 107.70 CHF""";
		var actual = calc.renderInvoice(price);
		Assertions.assertEquals(expected, actual);
	}
}
