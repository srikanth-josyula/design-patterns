package com.sample.behavioral.command.command.impl;

import com.sample.behavioral.command.command.ICommand;
import com.sample.behavioral.command.services.Fan;

/**
 * Fan stop Command where we are encapsulating both Object[fan] and the
 * operation[stop] together as command. This is the essence of the command.
 *
 */
public class StopFanCommand implements ICommand {

	String name;
	Fan fan;

	public StopFanCommand(Fan fan, String name) {
		super();
		this.fan = fan;
		this.name = name;
	}

	public void execute() {
		System.out.println("stoping Fan in "+name);
		fan.stop();
	}
}
