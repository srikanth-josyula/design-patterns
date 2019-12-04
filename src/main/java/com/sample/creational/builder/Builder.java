package com.sample.creational.builder;

import com.sample.creational.builder.builderService.HouseBuilder;
import com.sample.creational.builder.builderService.impl.IglooHouseBuilder;
import com.sample.creational.builder.service.impl.House;

public class Builder {
	public static void main(String[] args) {
		HouseBuilder iglooBuilder = new IglooHouseBuilder();
		Director director = new Director(iglooBuilder);
		director.constructHouse();
		House house = director.getHouse();
		System.out.println("Builder constructed: " + house.getType());
		System.out.println("construction Details of House are : " + house.getBasement() +", "+ house.getRoof() +", "+ house.getStructure() +", "+ house.getInterior());
	}
}
