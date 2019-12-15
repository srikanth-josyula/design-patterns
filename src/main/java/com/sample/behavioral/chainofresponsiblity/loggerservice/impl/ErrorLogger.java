package com.sample.behavioral.chainofresponsiblity.loggerservice.impl;

import com.sample.behavioral.chainofresponsiblity.loggerservice.AbstractLogger;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}
}