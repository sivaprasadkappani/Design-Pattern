package com.edlumens.msc.pattern.state;

public class Ringing implements MobileAlertState {

	@Override
	public void alert(AlertStateContext ctx) {
		System.out.println("Code here to do ringing ");
	}
}
