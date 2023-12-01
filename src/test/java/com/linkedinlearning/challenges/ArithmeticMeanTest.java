package com.linkedinlearning.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArithmeticMeanTest {
	@Test
	public void testMean() {
		Assertions.assertEquals(7.333, ArithmeticMean.mean(List.of(4, 6, 12)), 0.001);
		Assertions.assertEquals(5952.533, ArithmeticMean.mean(List.of(4, 6, 12, 27, 55, 66, 77, 88888, 22, 0, -23, 55, 22, 22, 55)), 0.001);
		Collection<Integer> coll = new ArrayList<>();
		coll.add(444);
		coll.add(555);
		coll.add(null);
		coll.add(666);
		Assertions.assertEquals(555.0, ArithmeticMean.mean(coll), 0.001);
	}
	@Test
	public void testMeanNullValue() {
		Collection<Integer> coll = new ArrayList<>();
		coll.add(444);
		coll.add(555);
		coll.add(null);
		coll.add(666);
		Assertions.assertEquals(555.0, ArithmeticMean.mean(coll), 0.001);
	}
}
