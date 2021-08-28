package com.example.zoo.model;

import static com.example.zoo.ZooConstants.FLYING;
import static com.example.zoo.ZooConstants.NO_FLY;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ButterflyTest {

	@Test
	public void testButterfly() {
		Butterfly butterfly = new Butterfly();
		assertTrue(butterfly.isAdult());
		assertEquals(FLYING, butterfly.fly());
	}

	@Test
	public void testCaterpillar() {
		Butterfly caterpillar = new Butterfly(false);
		assertFalse(caterpillar.isAdult());
		assertEquals(NO_FLY, caterpillar.fly());
	}
}
