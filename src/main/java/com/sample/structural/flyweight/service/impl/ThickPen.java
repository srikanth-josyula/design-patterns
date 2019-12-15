package com.sample.structural.flyweight.service.impl;

import com.sample.structural.flyweight.service.Pen;
import com.sample.structural.flyweight.utils.BrushSize;

public class ThickPen implements Pen {

	final BrushSize brushSize = BrushSize.THICK; // intrinsic state - shareable
	private String color = null; // extrinsic state - supplied by client

	public void setColor(String color) {
		this.color = color;
	}

	public void draw(String content) {
		System.out.println("Drawing THICK content in color : " + color);
	}
}