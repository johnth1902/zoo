package com.example.zoo.model;

import static com.example.zoo.ZooConstants.SOUND_BIRD;
import static com.example.zoo.ZooConstants.SOUND_CAT;
import static com.example.zoo.ZooConstants.SOUND_CHICKEN;
import static com.example.zoo.ZooConstants.SOUND_DOG;
import static com.example.zoo.ZooConstants.SOUND_DUCK;
import static com.example.zoo.ZooConstants.SOUND_ROOSTER;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BirdTest {

	@Test
	public void testBird() {
		Bird testBird = new Bird();
		assertEquals(SOUND_BIRD, testBird.sing());
	}

	@Test
	public void testDuck() {
		Duck testDuck = new Duck();
		assertEquals(SOUND_DUCK, testDuck.sing());
	}

	@Test
	public void testChicken() {
		Chicken testChicken = new Chicken();
		assertEquals(SOUND_CHICKEN, testChicken.sing());
	}

	@Test
	public void testRooster() {
		Rooster testRooster = new Rooster();
		assertEquals(SOUND_ROOSTER, testRooster.sing());
	}

	@Test
	public void testParrot() {
		Parrot testParrotNearDog = new Parrot(new Dog());
		assertEquals(SOUND_DOG, testParrotNearDog.sing());

		Parrot testParrotNearCat = new Parrot(new Cat());
		assertEquals(SOUND_CAT, testParrotNearCat.sing());

		Parrot testRoosterParrot = new Parrot(new Rooster());
		assertEquals(SOUND_ROOSTER, testRoosterParrot.sing());
	}
}
