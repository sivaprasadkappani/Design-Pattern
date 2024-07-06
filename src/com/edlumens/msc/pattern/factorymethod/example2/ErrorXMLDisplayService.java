package com.edlumens.msc.pattern.factorymethod.example2;

// Concrete Creator 1
public class ErrorXMLDisplayService extends DisplayService {
	@Override
	public XMLParser getParser() {
		return new ErrorXMLParser();
	}
}