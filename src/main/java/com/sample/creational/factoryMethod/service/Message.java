package com.sample.creational.factoryMethod.service;

/**
 * This class represents interface for our "product" which is a message
 * Implementations will be specific to content type.
 *
 */
public abstract class Message {

	public abstract String getContent();

	public void addDefaultHeaders() {
		System.out.println("added sample headers");
	}

}
