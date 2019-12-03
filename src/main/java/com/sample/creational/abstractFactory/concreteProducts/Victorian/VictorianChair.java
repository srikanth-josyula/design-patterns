package com.sample.creational.abstractFactory.concreteProducts.Victorian;

import com.sample.creational.abstractFactory.products.Chair;

public class VictorianChair implements Chair{

	public void sendChair() {
		System.out.println("Victorian Chair is Sent to Customer !!");
	}
}
