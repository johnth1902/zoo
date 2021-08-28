package com.example.zoo.model;

import com.example.zoo.ZooConstants.AnimalColor;
import com.example.zoo.ZooConstants.AnimalSize;

public class Fish extends Animal implements Swimmable {

	public Fish() {
	}

	public Fish(AnimalSize size, AnimalColor color) {
		super(size, color, true);
	}
}
