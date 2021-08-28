package com.example.zoo.model;

import com.example.zoo.ZooConstants.AnimalColor;
import com.example.zoo.ZooConstants.AnimalSize;

public class Shark extends Fish {

	public Shark() {
		super(AnimalSize.LARGE, AnimalColor.GREY);
	}

	public String eatOtherFish() {
		return "I eat other fish";
	}
}
