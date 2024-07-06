package com.edlumens.msc.pattern.abstractfactory;

//Concrete factory for MacOS
class MacOSFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}