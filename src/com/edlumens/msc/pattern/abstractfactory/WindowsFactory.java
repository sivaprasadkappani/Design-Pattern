package com.edlumens.msc.pattern.abstractfactory;

//Concrete factory for Windows
class WindowsFactory implements GUIFactory {
	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}