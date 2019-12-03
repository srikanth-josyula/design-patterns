package com.sample.creational.abstractFactory.factoryUtils;

import com.sample.creational.abstractFactory.products.Chair;
import com.sample.creational.abstractFactory.products.Sofa;

public interface FurnitureFactory {
	public Sofa createSofa();
	public Chair createChair(); 
}
