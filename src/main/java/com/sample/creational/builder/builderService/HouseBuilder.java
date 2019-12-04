package com.sample.creational.builder.builderService;

import com.sample.creational.builder.service.impl.House;

public interface HouseBuilder {

	public void buildBasement();
	public void buildStructure();
	public void bulidRoof();
	public void buildInterior();
	public House getHouse();
	public void setHouseType();
}