package com.sample.structural.proxy.proxy;

import com.sample.structural.proxy.service.impl.Cash;

public class CreditCard extends Cash {
	
	public void pay() {
		System.out.println("Delegating work on real object :: Payment done via credit card :: PAYMENT DONE");
	}

}