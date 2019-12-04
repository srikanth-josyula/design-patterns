package com.sample.structural.adapter;

import com.sample.structural.adapter.service.JSONMessage;
import com.sample.structural.adapter.service.XMLMessage;

public class ClientInterface implements JSONMessage{
	
	public XMLMessage adaptee;
	
	public ClientInterface(XMLMessage adaptee) {
		this.adaptee = adaptee;
	}
	
	public void converToServiceFormat(){
		adaptee.getXMLProdcers();
	}

	public String getContent() {
		return adaptee.getContent();
	}

	public void getJSONProdcers() {
		adaptee.getXMLProdcers();
	}
}
