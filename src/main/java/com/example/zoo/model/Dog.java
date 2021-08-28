package com.example.zoo.model;

import static com.example.zoo.ZooConstants.SOUND_DOG;

public class Dog extends Animal implements Walkable, Singable {

	@Override
	public String sing() {
		return SOUND_DOG;
	}
}
