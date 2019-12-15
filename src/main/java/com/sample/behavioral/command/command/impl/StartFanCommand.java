package com.sample.behavioral.command.command.impl;

import com.sample.behavioral.command.command.ICommand;
import com.sample.behavioral.command.services.Fan;

/**
 * Fan Start Command where we are encapsulating both Object[fan] and the
 * operation[start] together as command. This is the essence of the command.
 *
 */
public class StartFanCommand implements ICommand {

	String name;
	Fan fan;

	public StartFanCommand(Fan fan, String name) {
		super();
		this.fan = fan;
		this.name = name;
	}

	public void execute() {
		System.out.println("starting Fan in "+name);
		fan.start();
	}
}
