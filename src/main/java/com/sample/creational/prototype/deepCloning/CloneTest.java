package com.sample.creational.prototype.deepCloning;

public class CloneTest {

	public static void main(String args[]) {

		Programmer javaguru = new Programmer("John", 31);
		javaguru.addCertificates("OCPJP");
		javaguru.addCertificates("OCMJD");
		javaguru.addCertificates("PMP");
		javaguru.addCertificates("CISM");

		System.out.println("Before Original : "+javaguru);

		Programmer clone = javaguru.clone();

		System.out.println("Before Clone : "+clone);
		javaguru.addCertificates("Oracle DBA");
		System.out.println("\nAfter Orginal : "+javaguru);
		System.out.println("After Clone : "+clone);
	}
}
