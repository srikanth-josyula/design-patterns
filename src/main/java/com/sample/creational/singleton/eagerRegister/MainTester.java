package com.sample.creational.singleton.eagerRegister;


public class MainTester {
	public static void main(String args[]) {
		EagerSingletonClass ex = EagerSingletonClass.getInstance();
		EagerSingletonClass ey = EagerSingletonClass.getInstance();
		
		System.out.println("Object of Eager x is " + ex.hashCode());
		System.out.println("Object of Eager y is " + ey.hashCode());
		System.out.println("\n");
		
		StaticBlockSingleton sx = StaticBlockSingleton.INSTANCE;
		StaticBlockSingleton sy = StaticBlockSingleton.INSTANCE;

		System.out.println("Object of StaticBlock x is " + sx);
		//System.out.println("Object of StaticBlock y is " + sy.hashCode());
		System.out.println("\n");

	}
}
