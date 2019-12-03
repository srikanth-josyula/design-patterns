package com.sample.creational.factoryMethod.utils;

import com.sample.creational.factoryMethod.service.Message;
import com.sample.creational.factoryMethod.service.impl.TextMessage;

public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}
}
