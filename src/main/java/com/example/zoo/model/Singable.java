package com.example.zoo.model;

import static com.example.zoo.ZooConstants.SOUND_BIRD;

public interface Singable {

	default String sing() {
		return SOUND_BIRD;
	}
}
