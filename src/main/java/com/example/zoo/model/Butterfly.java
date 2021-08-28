package com.example.zoo.model;

import static com.example.zoo.ZooConstants.NO_FLY;

import com.example.zoo.ZooConstants.AnimalColor;
import com.example.zoo.ZooConstants.AnimalSize;

public class Butterfly extends Animal implements Flyable, Walkable {

	public Butterfly() {
		this(true);
	}

	public Butterfly(boolean adult) {
		super(AnimalSize.SMALL, AnimalColor.WHITE, adult);
	}

	@Override
	public String fly() {
		if (isAdult()) {
			return Flyable.super.fly();
		} else {
			return NO_FLY;
		}
	}

	@Override
	public String walk() {
		if (isAdult()) {
			return "Too old to walk";
		} else {
			return Walkable.super.walk();
		}
	}
}
