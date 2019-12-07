package com.sample.structural.decorator.component.impl;

import com.sample.structural.decorator.component.Pizza;

public class BasicPizza implements Pizza {

	public void getCost() {
		System.out.println("Basic Pizza Costs :: Rs. 49 ");
	}

}
