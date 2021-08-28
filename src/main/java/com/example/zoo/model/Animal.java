package com.example.zoo.model;

import com.example.zoo.ZooConstants.AnimalColor;
import com.example.zoo.ZooConstants.AnimalSize;

public abstract class Animal {
	private AnimalSize size;
	private AnimalColor color;
	private boolean adult;

	public Animal() {
	}

	public Animal(AnimalSize size, AnimalColor color, boolean adult) {
		this.size = size;
		this.color = color;
		this.adult = adult;
	}

	public AnimalSize getSize() {
		return size;
	}

	public AnimalColor getColor() {
		return color;
	}

	public boolean isAdult() {
		return adult;
	}
}
