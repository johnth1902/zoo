package com.example.zoo.model;

import com.example.zoo.ZooConstants.AnimalColor;
import com.example.zoo.ZooConstants.AnimalSize;

public class Clownfish extends Fish {

	public Clownfish() {
		super(AnimalSize.SMALL, AnimalColor.ORANGE);
	}

	public String makeJokes() {
		return "I make jokes";
	}
}
