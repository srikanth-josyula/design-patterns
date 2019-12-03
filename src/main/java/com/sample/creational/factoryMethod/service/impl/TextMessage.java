package com.sample.creational.factoryMethod.service.impl;

import com.sample.creational.factoryMethod.service.Message;

public class TextMessage extends Message {

	@Override
	public String getContent() {
		String content = "Some Random TEXT Content";
	return content;
	}
}
