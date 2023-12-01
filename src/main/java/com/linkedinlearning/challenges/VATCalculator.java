package com.linkedinlearning.challenges;

public class VATCalculator {
	private final double vat;
	private final String currencySymbol;

	public VATCalculator(double vat, String currencySymbol) {
		this.vat = vat;
		this.currencySymbol = currencySymbol;
	}

	public String renderInvoice(final double price) {
		var vatAmount = price * this.vat;
		var total = price + vatAmount;
		return """
				Netto: %2$.2f %1$s
				VAT (%3$.3f): %4$.2f %1$s
				Total: %5$.2f %1$s"""
				.formatted(
						currencySymbol,
						price,
						vat, vatAmount,
						total);
	}
}
