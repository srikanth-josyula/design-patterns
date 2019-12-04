package com.sample.structural.adapter.service.impl;

import com.sample.structural.adapter.service.JSONMessage;

public class JSONMessageImpl implements JSONMessage {

	public String getContent() {
		return "Content format in JSON";
	}

	public void getJSONProdcers() {
		System.out.println("application/JSON");
	}
	

	
}
