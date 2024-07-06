package com.edlumens.msc.pattern.abstractfactory;

//Concrete product A2
class MacOSButton implements Button {
	@Override
	public void click() {
		System.out.println("MacOS button clicked.");
	}
}