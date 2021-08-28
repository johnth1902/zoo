package com.example.zoo.model;

import static com.example.zoo.ZooConstants.SOUND_ROOSTER;

public class Rooster extends Chicken {

	@Override
	public String sing() {
		return SOUND_ROOSTER;
	}
}
