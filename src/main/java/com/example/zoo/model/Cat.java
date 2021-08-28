package com.example.zoo.model;

import static com.example.zoo.ZooConstants.SOUND_CAT;

public class Cat extends Animal implements Walkable, Singable {

	@Override
	public String sing() {
		return SOUND_CAT;
	}
}
