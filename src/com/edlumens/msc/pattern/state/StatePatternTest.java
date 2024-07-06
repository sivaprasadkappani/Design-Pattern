package com.edlumens.msc.pattern.state;

public class StatePatternTest {
	public static void main(String[] args) {
		AlertStateContext stateContext = new AlertStateContext();
		
		stateContext.alert();
		stateContext.alert();
		
		
		stateContext.setState(new Silent());
		stateContext.alert();
		stateContext.alert();
		 
		
		stateContext.setState(new Ringing());
		stateContext.alert();
		 
	}
}
