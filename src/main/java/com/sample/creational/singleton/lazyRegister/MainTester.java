package com.sample.creational.singleton.lazyRegister;

public class MainTester {
	public static void main(String args[]) {
		SingletonFactory x = SingletonFactory.getInstance();
		SingletonFactory y = SingletonFactory.getInstance();
		SingletonFactory z = SingletonFactory.getInstance();

		// changing variable of instance x
		x.str = (x.str).toUpperCase();

		System.out.println("Object of x is " + x.hashCode());
		System.out.println("String from x is " + x.str);
		System.out.println("Object of y is " + x.hashCode());
		System.out.println("String from y is " + y.str);
		System.out.println("Object of z is " + x.hashCode());
		System.out.println("String from z is " + z.str);
		System.out.println("\n");

		// changing variable of instance z
		z.str = (z.str).toLowerCase();

		System.out.println("String from x is " + x.str);
		System.out.println("String from y is " + y.str);
		System.out.println("String from z is " + z.str);
	}
}
