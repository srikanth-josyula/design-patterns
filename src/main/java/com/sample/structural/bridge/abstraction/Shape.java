package com.sample.structural.bridge.abstraction;

import com.sample.structural.bridge.implementation.Colours;

public abstract class Shape {

	protected Colours colour;

	public Shape(Colours colour) {
		this.colour = colour;
	}

	public abstract String getShape();
	public abstract String getColour();
}
