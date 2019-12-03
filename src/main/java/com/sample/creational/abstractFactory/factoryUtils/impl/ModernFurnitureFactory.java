package com.sample.creational.abstractFactory.factoryUtils.impl;

import com.sample.creational.abstractFactory.concreteProducts.Modern.ModernChair;
import com.sample.creational.abstractFactory.concreteProducts.Modern.ModernSofa;
import com.sample.creational.abstractFactory.factoryUtils.FurnitureFactory;
import com.sample.creational.abstractFactory.products.Chair;
import com.sample.creational.abstractFactory.products.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {

	public Sofa createSofa() {
		return new ModernSofa();
	}

	public Chair createChair() {
		return new ModernChair();
	}

}
