package com.edlumens.msc.pattern.abstractfactory;

//Concrete product A1
class WindowsButton implements Button {
	@Override
	public void click() {
		System.out.println("Windows button clicked.");
	}
}