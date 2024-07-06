package com.edlumens.msc.pattern.factorymethod.example2;

// Concrete creator 4
public class ResponseXMLDisplayService extends DisplayService {
	@Override
	public XMLParser getParser() {
		return new ResponseXMLParser();
	}
}