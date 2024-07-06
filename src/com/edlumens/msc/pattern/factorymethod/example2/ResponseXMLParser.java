package com.edlumens.msc.pattern.factorymethod.example2;

// Concrete Product 4
public class ResponseXMLParser implements XMLParser {
	
	@Override
	public String parse() {
		System.out.println("Parsing response XML...");
		return "Response XML Message";
	}
}
