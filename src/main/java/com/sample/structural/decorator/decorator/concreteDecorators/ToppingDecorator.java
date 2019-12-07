package com.sample.structural.decorator.decorator.concreteDecorators;

import com.sample.structural.decorator.component.Pizza;
import com.sample.structural.decorator.decorator.PizzaDecorator;

public class ToppingDecorator extends PizzaDecorator {
	private String baseType = null;
	
	public ToppingDecorator(Pizza pizza,String baseType) {
		super(pizza,baseType);
		this.baseType=baseType;
	}
	
	@Override
	public void getCost(){
		super.getCost();
		if(baseType.equalsIgnoreCase("Veggi Paradise"))
		System.out.println("Veggi Paradise Topping Costs :: Rs. 80");
	}
}
