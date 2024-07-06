package com.edlumens.msc.pattern.factorymethod.example2;

// Concrete Product 3
public class OrderXMLParser implements XMLParser {
	
	@Override
	public String parse() {
		System.out.println("Parsing order XML...");
		return "Order XML Message";
	}
}
