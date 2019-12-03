package com.sample.creational.factoryMethod.utils;

import com.sample.creational.factoryMethod.service.Message;
import com.sample.creational.factoryMethod.service.impl.JSONMessage;

public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

}
