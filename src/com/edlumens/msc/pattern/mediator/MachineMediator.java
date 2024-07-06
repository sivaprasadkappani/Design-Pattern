package com.edlumens.msc.pattern.mediator;

public interface MachineMediator {

	public void start();
	public void wash();
	public void open();
	public void closed();
	public void on();
	public void off();
	public boolean checkTemperature(int temp);
	
}
