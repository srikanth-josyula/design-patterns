package com.sample.creational.abstractFactory;

import com.sample.creational.abstractFactory.factoryUtils.FurnitureFactory;
import com.sample.creational.abstractFactory.factoryUtils.impl.ModernFurnitureFactory;
import com.sample.creational.abstractFactory.factoryUtils.impl.VictorianFurnitureFactory;
import com.sample.creational.abstractFactory.products.Chair;
import com.sample.creational.abstractFactory.products.Sofa;

public class Client {
	private FurnitureFactory factory;

	public Client(FurnitureFactory factory) {
		this.factory = factory;
	}

	public void createUnit() {
		// Sofa Object is created
		Sofa sofaUnit = factory.createSofa();
		sofaUnit.sendSofa();

		// Chair Object is created
		Chair chairUnit = factory.createChair();
		chairUnit.sendChair();
	}

	public static void main(String[] args) {

		Client victorianUnit = new Client(new VictorianFurnitureFactory());
		victorianUnit.createUnit();
		System.out.println("***************************************");
		Client modernUnit = new Client(new ModernFurnitureFactory());
		modernUnit.createUnit();

	}
}
