package com.sample.creational.singleton;

/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class ClassicSingleton {

    private ClassicSingleton() {
    	
    }
    
    private static volatile ClassicSingleton INSTANCE;
    
    public static ClassicSingleton getInstance() {
    	if(INSTANCE == null) {
    		synchronized (ClassicSingleton.class) {
				if(INSTANCE == null) {
					INSTANCE = new ClassicSingleton();				
				}
			}
    	}
    	return INSTANCE;
    }
}
