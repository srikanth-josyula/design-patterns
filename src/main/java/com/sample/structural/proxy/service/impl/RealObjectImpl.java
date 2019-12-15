package com.sample.structural.proxy.service.impl;

import com.sample.structural.proxy.service.RealObject;

public class RealObjectImpl implements RealObject {
	 
    public void doSomething() {
        System.out.println("Performing work in real object");
    }
 
}