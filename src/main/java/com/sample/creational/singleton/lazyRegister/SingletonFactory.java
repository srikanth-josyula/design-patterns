package com.sample.creational.singleton.lazyRegister;

/**
 * this is a lazy initialiazation way, causes issues in multithreading evn
 **/

public class SingletonFactory {
	
	private static SingletonFactory INSTANCE;
	public String str; 
	
	private SingletonFactory() {
		str = "Hello I am a string part of Singleton class"; 
	}

	public static SingletonFactory getInstance() {
		if (INSTANCE == null) {
				if (INSTANCE == null) {
					INSTANCE = new SingletonFactory();
				}
		}
		return INSTANCE;
	}
}
