package com.edlumens.msc.pattern.abstractfactory;

//Concrete product B1
class WindowsCheckbox implements Checkbox {
	@Override
	public void check() {
		System.out.println("Windows checkbox checked.");
	}
}