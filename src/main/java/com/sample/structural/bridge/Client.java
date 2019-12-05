package com.sample.structural.bridge;

import com.sample.structural.bridge.abstraction.Shape;
import com.sample.structural.bridge.abstraction.Sqaure;
import com.sample.structural.bridge.implementation.impl.BlueColour;

public class Client {

	public static void main(String[] args) {
		Shape s = new Sqaure(new BlueColour());
		System.out.println(s.getShape());
		System.out.println(s.getColour());
	}
}
