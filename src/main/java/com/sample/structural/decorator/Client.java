package com.sample.structural.decorator;

import com.sample.structural.decorator.component.Pizza;
import com.sample.structural.decorator.component.impl.BasicPizza;
import com.sample.structural.decorator.decorator.concreteDecorators.BaseDecorator;
import com.sample.structural.decorator.decorator.concreteDecorators.ToppingDecorator;

public class Client {
	public static void main(String[] args) {
		Pizza cheesePizza = new BaseDecorator(new BasicPizza(), "CheeseBurst");
		cheesePizza.getCost();
		System.out.println("\n*****");
		
		Pizza veggieCheese = new BaseDecorator(new ToppingDecorator(new BasicPizza(),"Veggi Paradise"),"CheeseBurst");
		veggieCheese.getCost();
	}
}
