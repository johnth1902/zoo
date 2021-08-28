package com.example.zoo.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class AnimalTest {

	@Test
	public void testAnimal() {
		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Fish(), new Shark(), new Clownfish(), new Dolphin(), new Frog(), new Dog(), new Butterfly(),
				new Cat() };
		int flyerCount = 0, walkerCount = 0, swimmerCount = 0, singerCount = 0;
		for (Animal animal : animals) {
			if (animal instanceof Walkable) {
				walkerCount++;
			}
			if (animal instanceof Swimmable) {
				swimmerCount++;
			}
			if (animal instanceof Singable) {
				singerCount++;
			}
			if (animal instanceof Flyable) {
				flyerCount++;
			}
		}
		assertEquals(2, flyerCount);
		assertEquals(8, walkerCount);
		assertEquals(6, swimmerCount);
		assertEquals(7, singerCount);
	}
}
