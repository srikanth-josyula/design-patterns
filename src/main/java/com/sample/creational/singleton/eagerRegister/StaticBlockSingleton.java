package com.sample.creational.singleton.eagerRegister;

/**
 * This way of creating Singleton class with static block leads to many resource wastage issues 
 **/

public class StaticBlockSingleton {
	public static StaticBlockSingleton INSTANCE;

	private StaticBlockSingleton() {
	}

	{
		// static block to initialize instance
		INSTANCE = new StaticBlockSingleton();
	}
}
