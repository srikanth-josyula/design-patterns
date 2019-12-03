package com.sample.creational.abstractFactory.factoryUtils.impl;

import com.sample.creational.abstractFactory.concreteProducts.Victorian.VictorianChair;
import com.sample.creational.abstractFactory.concreteProducts.Victorian.VictorianSofa;
import com.sample.creational.abstractFactory.factoryUtils.FurnitureFactory;
import com.sample.creational.abstractFactory.products.Chair;
import com.sample.creational.abstractFactory.products.Sofa;

public class VictorianFurnitureFactory implements FurnitureFactory{

	public Sofa createSofa() {
		return new VictorianSofa();
	}

	public Chair createChair() {
		return new VictorianChair();
	}

}
