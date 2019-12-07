package com.sample.structural.decorator.decorator.concreteDecorators;

import com.sample.structural.decorator.component.Pizza;
import com.sample.structural.decorator.decorator.PizzaDecorator;

public class BaseDecorator extends PizzaDecorator {
	private String baseType = null;
	
	public BaseDecorator(Pizza pizza,String baseType) {
		super(pizza,baseType);
		this.baseType=baseType;
	}
	
	@Override
	public void getCost(){
		super.getCost();
		if(baseType.equalsIgnoreCase("CheeseBurst"))
		System.out.println("CheeseBurst Base Costs :: Rs. 30");
	}
}
