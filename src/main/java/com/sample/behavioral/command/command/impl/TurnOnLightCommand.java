package com.sample.behavioral.command.command.impl;

import com.sample.behavioral.command.command.ICommand;
import com.sample.behavioral.command.services.Light;

/**
 * Light Start Command where we are encapsulating both Object[light] and the
 * operation[turnOn] together as command. This is the essence of the command.
 *
 */
public class TurnOnLightCommand implements ICommand {

	String name;
	Light light;

	public TurnOnLightCommand(Light light, String name) {
		super();
		this.light = light;
		this.name = name;
	}

	public void execute() {
		System.out.println("Turning on light in "+name);
		light.turnOn();
	}
}
