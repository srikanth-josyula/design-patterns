package com.sample.structural.proxy;

import com.sample.structural.proxy.proxy.CreditCard;
import com.sample.structural.proxy.service.Payment;
import com.sample.structural.proxy.service.impl.Cash;

public class Client {
	
	public static void main(String[] args) {
		Payment real = new Cash();
		real.pay();
		Payment proxy = new CreditCard();
		proxy.pay();
	}
}