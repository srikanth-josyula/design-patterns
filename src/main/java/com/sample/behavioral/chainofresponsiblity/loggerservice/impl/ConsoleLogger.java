package com.sample.behavioral.chainofresponsiblity.loggerservice.impl;

import com.sample.behavioral.chainofresponsiblity.loggerservice.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}
}