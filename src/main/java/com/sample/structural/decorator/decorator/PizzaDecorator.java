package com.sample.structural.decorator.decorator;

import com.sample.structural.decorator.component.Pizza;

public class PizzaDecorator implements Pizza{
	protected Pizza pizza;
	protected String baseType;
	
	public PizzaDecorator(Pizza pizza,String baseType) {
		this.pizza = pizza;
		this.baseType = baseType;
	}

	public void getCost() {
		this.pizza.getCost();
	}

}
