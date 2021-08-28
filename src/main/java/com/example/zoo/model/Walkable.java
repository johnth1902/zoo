package com.example.zoo.model;

public interface Walkable {
	default String walk() {
		return "I am walking";
	}
}
