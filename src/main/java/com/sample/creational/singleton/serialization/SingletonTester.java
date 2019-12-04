package com.sample.creational.singleton.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonTester {
	public static void main(String[] args) {

		try {
			SerializeSingleton instance1 = SerializeSingleton.getInstance();
			ObjectOutput out = null;

			out = new ObjectOutputStream(new FileOutputStream("C:/Users/R003744/Desktop/Kanth_/alfresco-rm/test_rfolder/pom-Copy.xml"));
			out.writeObject(instance1);
			out.close();

			// deserialize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("C:/Users/R003744/Desktop/Kanth_/alfresco-rm/test_rfolder/pom-Copy.xml"));
			SerializeSingleton instance2 = (SerializeSingleton) in.readObject();
			in.close();

			System.out.println("instance1 hashCode=" + instance1.hashCode());
			System.out.println("instance2 hashCode=" + instance2.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}