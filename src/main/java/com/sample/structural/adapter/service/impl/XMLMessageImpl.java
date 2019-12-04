package com.sample.structural.adapter.service.impl;

import com.sample.structural.adapter.service.XMLMessage;

public class XMLMessageImpl implements XMLMessage {
	
	public String getContent() {
		return "Content format in XML";
	}

	public void getXMLProdcers() {
		System.out.println("application/XML");
	}

}
