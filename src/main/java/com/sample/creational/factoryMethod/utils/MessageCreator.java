package com.sample.creational.factoryMethod.utils;

import com.sample.creational.factoryMethod.service.Message;

/**
 * This is our abstract "creator". The abstract method createMessage() has to be
 * implemented by its subclasses.
 */
public abstract class MessageCreator {
	public abstract Message createMessage();
}
