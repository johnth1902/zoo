package com.example.zoo.model;

import static com.example.zoo.ZooConstants.SOUND_CHICKEN;

public class Chicken extends Bird {

	@Override
	public String sing() {
		return SOUND_CHICKEN;
	}
}
