package com.linkedinlearning.challenges;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Diamond {

	private final char c;

	public Diamond(char c) {
		this.c = c;
	}

	public String renderDiamond() {
		Stream.Builder<Character> builder = Stream.builder();
		for (char i = 'A'; i <= c; i++) {
			builder.add(i);
		}
		for (int i=c-1; i>='A'; i--) {
			builder.add((char)i);
		}
		return builder.build()
				.map(this::renderLine)
				.collect(Collectors.joining("\n"));
	}

	private String renderLine(char l) {
		StringBuilder b = new StringBuilder();
		b.append(" ".repeat(Math.max(0, c - l)));
		b.append(l);
		if (l > 'A') {
			b.append(" ".repeat((l - 'A')*2-1)).append(l);
		}
		return b.toString();
	}

	public static class Fibonacci {

		public static long fibonacci(final int n) {
			if (n < 0) throw new RuntimeException(new IllegalAccessException());
			if (n == 0 || n == 1) {
				return n;
			}
			return fibonacci(n - 1) + fibonacci(n - 2);
		}

		public static long fibo2(final int n) {
			if (n < 0) throw new RuntimeException(new IllegalAccessException());
			if (n == 0 || n == 1) {
				return n;
			}
			long[] fa = new long[n+1];
			fa[0] = 0;
			fa[1] = 1;
			for (int i = 2; i <= n; i++) {
				fa[i] = fa[i-2] + fa[i-1];
			}
			return fa[n];
		}
	}
}
