package com.example.zoo.model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.zoo.ZooConstants.AnimalColor;
import com.example.zoo.ZooConstants.AnimalSize;

@RunWith(SpringRunner.class)
public class FishTest {

	@Test
	public void testFish() {
		Fish fish = new Fish();
		fish.swim();
	}

	@Test
	public void testShark() {
		Shark shark = new Shark();
		assertEquals(AnimalColor.GREY, shark.getColor());
		assertEquals(AnimalSize.LARGE, shark.getSize());
		shark.eatOtherFish();
	}

	@Test
	public void testClownFish() {
		Clownfish clownFish = new Clownfish();
		assertEquals(AnimalColor.ORANGE, clownFish.getColor());
		assertEquals(AnimalSize.SMALL, clownFish.getSize());
		clownFish.makeJokes();
	}

	@Test
	public void testDolphin() {
		Dolphin dolphin = new Dolphin();
		assertTrue(dolphin instanceof Swimmable);
	}
}
