package com.edlumens.msc.pattern.mediator;

public class MediatorPatternTest {

	public static void main(String[] args) {
		MachineMediator mediator = null;
		Sensor sensor = new Sensor();
		SoilRemoval soilRemoval = new SoilRemoval();
		Motor motor = new Motor();
		Machine machine = new Machine();
		Heater heater = new Heater();
		Valve valve = new Valve();
		Button button = new Button();
		mediator = new CottonMediator(machine, heater, motor, sensor, soilRemoval,
		valve);
		button.setMediator(mediator);
		machine.setMediator(mediator);
		heater.setMediator(mediator);
		valve.setMediator(mediator);
		button.press();


	}

}
