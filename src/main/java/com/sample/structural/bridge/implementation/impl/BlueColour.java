package com.sample.structural.bridge.implementation.impl;

import com.sample.structural.bridge.implementation.Colours;

public class BlueColour implements Colours{

	public String getBaseColour() {
		return "Dark Blue";
	}

	public String getBodyColour() {
		return "Navy Blue";
	}

}
