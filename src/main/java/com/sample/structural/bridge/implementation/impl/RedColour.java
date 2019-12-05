package com.sample.structural.bridge.implementation.impl;

import com.sample.structural.bridge.implementation.Colours;

public class RedColour implements Colours{

	public String getBaseColour() {
		return "Dark Red";
	}

	public String getBodyColour() {
		return "Pale Red";
	}

}
