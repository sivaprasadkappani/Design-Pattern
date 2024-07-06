package com.edlumens.msc.pattern.factorymethod.example2;

// Concrete creator 3
public class OrderXMLDisplayService extends DisplayService {
	@Override
	public XMLParser getParser() {
		return new OrderXMLParser();
	}
}
