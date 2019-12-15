package com.sample.structural.flyweight.service.impl;

import com.sample.structural.flyweight.service.Pen;
import com.sample.structural.flyweight.utils.BrushSize;

public class MediumPen implements Pen {
	final BrushSize brushSize = BrushSize.MEDIUM;
    private String color = null;
     
    public void setColor(String color) {
        this.color = color;
    }
 
    public void draw(String content) {
        System.out.println("Drawing MEDIUM content in color : " + color);
    }
}
