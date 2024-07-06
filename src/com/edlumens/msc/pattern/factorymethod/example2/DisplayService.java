package com.edlumens.msc.pattern.factorymethod.example2;


// Creator
public abstract class DisplayService {

	public void display() {
		XMLParser parser = getParser();
		String msg = parser.parse();
		System.out.println(msg);
	}

	// Factory method
	protected abstract XMLParser getParser();
}