package com.sample.creational.singleton.serialization;

public class SerializeSingleton {

	private SerializeSingleton() {

	}

	private static volatile SerializeSingleton INSTANCE;

	public static SerializeSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (SerializeSingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new SerializeSingleton();
				}
			}
		}
		return INSTANCE;
	}
}
