package com.sample.creational.prototype.deepCloning;

import java.util.ArrayList;
import java.util.List;

public class Programmer implements Cloneable {

	private String name;
	private int age;
	private List certifications;

	public Programmer(String name, int age) {
		this.name = name;
		this.age = age;
		this.certifications = new ArrayList();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List getCertifications() {
		return certifications;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCertifications(List certifications) {
		this.certifications = certifications;
	}

	public void addCertificates(String certs) {
		certifications.add(certs);
	}

	@Override
	public String toString() {
		return String.format("%s, %d, Certifications: %s", name, age, certifications.toString());
	}

	@Override
	protected Programmer clone() {
		Programmer clone = null;
		try {
			clone = (Programmer) super.clone();
			clone.certifications = new ArrayList(certifications);
		} catch (CloneNotSupportedException cns) {
			cns.printStackTrace();
		}
		return clone;
	}
}