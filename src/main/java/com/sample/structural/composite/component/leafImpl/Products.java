package com.sample.structural.composite.component.leafImpl;

import com.sample.structural.composite.component.Items;

public class Products implements Items {
	private String name;
	private String type;

	public Products(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public void showItemDetails(){ 
        System.out.println("Name of the Product is :: "+name+" it is of Type :: " +type); 
    }
}
