package com.sample.creational.builder;

import com.sample.creational.builder.builderService.HouseBuilder;
import com.sample.creational.builder.service.impl.House;

public class Director {
	private HouseBuilder houseBuilder;

	public Director(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public House getHouse() {
		this.houseBuilder.setHouseType();
		return this.houseBuilder.getHouse();
	}
	
	public void constructHouse() {
		this.houseBuilder.buildBasement();
		this.houseBuilder.buildStructure();
		this.houseBuilder.bulidRoof();
		this.houseBuilder.buildInterior();
	}
	
}
