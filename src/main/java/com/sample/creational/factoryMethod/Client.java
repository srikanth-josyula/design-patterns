package com.sample.creational.factoryMethod;

import com.sample.creational.factoryMethod.utils.JSONMessageCreator;
import com.sample.creational.factoryMethod.utils.MessageCreator;

public class Client {

	public static void main(String[] args) {

		printMessage(new JSONMessageCreator());
		printMessage("JSON");

	}

	public static void printMessage(MessageCreator creator) {
		System.out.println(creator.createMessage().getContent());
	}

	public static void printMessage(String creatorName) {
		if (creatorName.equalsIgnoreCase("JSON")) {
			System.out.println(new JSONMessageCreator().createMessage().getContent());
			new JSONMessageCreator().createMessage().addDefaultHeaders();
		}
	}
}
