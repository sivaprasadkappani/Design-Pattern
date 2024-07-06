package com.edlumens.msc.pattern.factorymethod.example2;


// Concrete creator 2
public class FeedbackXMLDisplayService extends DisplayService {
	@Override
	public XMLParser getParser() {
		return new FeedbackXML();
	}
}