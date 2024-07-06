package com.edlumens.msc.pattern.factorymethod.example2;

// Concrete Product 1
public class ErrorXMLParser implements XMLParser {
	
	@Override
	public String parse() {

		System.out.println("Parsing error XML...");
		return "Error XML Message";
	}
}
