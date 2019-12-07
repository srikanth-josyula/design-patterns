package com.sample.structural.composite.component.leafImpl;

import com.sample.structural.composite.component.Items;

public class Box implements Items { 
    private String name;
	private String type;

	public Box(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public void showItemDetails(){ 
        System.out.println("Name of the Box is :: "+name+" it is of Type :: " +type); 
    }
}
