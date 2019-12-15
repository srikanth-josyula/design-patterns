package com.sample.structural.proxy.service.impl;

import com.sample.structural.proxy.service.Payment;

public class Cash implements Payment {

	public void pay() {
		System.out.println("Performing work in real object :: Payment done via cash :: PAYMENT DONE");	
	}
 
}