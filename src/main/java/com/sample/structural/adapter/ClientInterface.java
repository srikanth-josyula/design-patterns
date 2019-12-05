package com.sample.structural.adapter;

import com.sample.structural.adapter.service.XMLMessage;

public class ClientInterface{
	
	public XMLMessage adaptee;
	
	public ClientInterface(XMLMessage adaptee) {
		this.adaptee = adaptee;
	}
	
	public void converToServiceFormat() {
		adaptee.getXMLProdcers();
	}
}
