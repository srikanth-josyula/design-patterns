package com.sample.creational.prototype.cloning;

public class CloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		long startTime = System.nanoTime();
		Rectangle rec = new Rectangle(30, 60);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Time taken to create an object using new operator :"+totalTime);
		
		
		long clonestartTime = System.nanoTime();
		Rectangle cloned = rec.clone();
		long cloneendTime   = System.nanoTime();
		long clonetotalTime = cloneendTime - clonestartTime;
		System.out.println("Time taken to create an object using cloning :"+clonetotalTime);
		
		Rectangle copy = rec ;
		
		System.out.println("\nOriginal object :" + rec.hashCode());
		System.out.println("Clonned object  :" + cloned.hashCode());
		System.out.println("Copy object :" +copy.hashCode());
			
		// testing properties of object returned by clone method in Java
		System.out.println("\ncloned != rec : " + (cloned != rec));
		System.out.println("cloned.getClass() == rec.getClass() : " + (cloned.getClass() == rec.getClass()));
		System.out.println("cloned.equals(rec) : " + cloned.equals(rec));

		// Updating fields in original object
		rec.setHeight(100);
		rec.setWidth(45);
		
		//copy.setHeight(0);

		System.out.println("\nOriginal object :" + rec.getHeight());
		System.out.println("Clonned object  :" + cloned.getHeight());
	}

}
