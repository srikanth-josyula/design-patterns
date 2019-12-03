package com.sample.creational.factoryMethod.service.impl;

import com.sample.creational.factoryMethod.service.Message;

public class JSONMessage extends Message {

	@Override
	public String getContent() {
		String content = "Some Random JSON Content";
	return content;
	}
}
