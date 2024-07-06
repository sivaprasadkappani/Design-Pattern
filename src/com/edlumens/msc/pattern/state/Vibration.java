package com.edlumens.msc.pattern.state;

public class Vibration implements MobileAlertState {

	@Override
	public void alert(AlertStateContext ctx) {
		System.out.println("Code here to trigger the vibration  ");
	}
}
