package com.sample.structural.adapter;

import com.sample.structural.adapter.service.impl.XMLMessageImpl;

/**
 * My Client previouly use XML data, after new upgrade my middle layer uses JSON
 * data but for my client i need to send same XML
 **/
public class Client {
	public static void main(String[] args) {
		XMLMessageImpl xml = new XMLMessageImpl();

		// Before Updation of APP
		System.out.print("Return Format of Data Received is :: ");
		xml.getXMLProdcers();

		// Now my XML data behaves as JSON data
		ClientInterface dataAdapter = new ClientInterface(xml);
		System.out.print("Return Format of Data Received is after Upgrade app :: ");
		dataAdapter.converToServiceFormat();
	}
}
