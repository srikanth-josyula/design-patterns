package com.sample.creational.builder.service.impl;

import com.sample.creational.builder.service.HousePlan;

public class House implements HousePlan {

	private String basement;
	private String structure;
	private String roof;
	private String interior;
	private String type;

	public String getBasement() {
		return basement;
	}

	public void setBasement(String basement) {
		this.basement = basement;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public String getInterior() {
		return interior;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}