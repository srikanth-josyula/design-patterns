package com.sample.behavioral.command.services;

/**
 * Fan class is a Receiver component in command pattern terminology.
 *
 */
public class Fan {
	public void start() {
		System.out.println("Fan Started..");

	}

	public void stop() {
		System.out.println("Fan stopped..");

	}
}