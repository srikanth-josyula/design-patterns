package com.sample.creational.abstractFactory.concreteProducts.Modern;

import com.sample.creational.abstractFactory.products.Chair;

public class ModernChair implements Chair{

	public void sendChair() {
		System.out.println("Modern Chair is Sent to Customer !!");
	}
}
