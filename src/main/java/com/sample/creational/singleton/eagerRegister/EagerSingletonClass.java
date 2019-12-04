package com.sample.creational.singleton.eagerRegister;

/**
 * This way of creating Singleton class with final keyword is a naive way, not useful
 **/

public class EagerSingletonClass {
	private static final EagerSingletonClass INSTANCE = new EagerSingletonClass();

	private EagerSingletonClass() {
	}

	public static EagerSingletonClass getInstance() {
		return INSTANCE;
	}
}
