package com.sample.creational.singleton;

public class Client {
	
	public static void main(String[] args) {
		ClassicSingleton cs = ClassicSingleton.getInstance();
		ClassicSingleton cs1 = ClassicSingleton.getInstance();
		if(cs.hashCode() == cs1.hashCode())
			System.out.println("This is a Singleton Object");
	}
	
}
