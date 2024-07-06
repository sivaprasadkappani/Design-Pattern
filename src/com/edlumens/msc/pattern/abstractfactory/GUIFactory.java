package com.edlumens.msc.pattern.abstractfactory;

//Abstract factory
interface GUIFactory {
	Button createButton();

	Checkbox createCheckbox();
}
