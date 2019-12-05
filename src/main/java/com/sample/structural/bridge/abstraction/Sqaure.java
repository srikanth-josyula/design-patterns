package com.sample.structural.bridge.abstraction;

import com.sample.structural.bridge.implementation.Colours;

public class Sqaure extends Shape {

	public Sqaure(Colours colour) {
		super(colour);
	}

	@Override
	public String getShape() {
		return "Sqaure Object";
	}

	@Override
	public String getColour() {
		return colour.getBodyColour();
	}

}
