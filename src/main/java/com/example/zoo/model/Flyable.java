package com.example.zoo.model;

import static com.example.zoo.ZooConstants.FLYING;

public interface Flyable {
	default String fly() {
		return FLYING;
	}
}
