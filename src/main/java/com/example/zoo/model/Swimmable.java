package com.example.zoo.model;

public interface Swimmable {
	default void swim() {
		System.out.println("I am swimming");
	}
}
