package com.example.zoo.model;

import static com.example.zoo.ZooConstants.SOUND_PARROT;

public class Parrot extends Bird implements Flyable {

	private Singable neighbor;

	public Parrot() {
	}

	public Parrot(Singable neighbor) {
		this.neighbor = neighbor;
	}

	public String sing() {
		if (neighbor != null) {
			return neighbor.sing();
		} else {
			return SOUND_PARROT;
		}
	}
}
