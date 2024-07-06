package com.edlumens.msc.pattern.abstractfactory;

//Concrete product B2
class MacOSCheckbox implements Checkbox {
	@Override
	public void check() {
		System.out.println("MacOS checkbox checked.");
	}
}