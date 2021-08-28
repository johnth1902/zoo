package com.example.zoo.model;

import static com.example.zoo.ZooConstants.SOUND_DUCK;

public class Duck extends Bird implements Swimmable {

	@Override
	public String sing() {
		return SOUND_DUCK;
	}
}
