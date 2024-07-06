package com.edlumens.msc.pattern.templatemethod;

public abstract class OrderProcessTemplate {
	public boolean isGift;

	// Template method
	public final void processOrder(boolean isGift) {
		doSelect();
		doPayment();
		if (isGift) {
			giftWrap();
		}
		doDelivery();
	}

	// Defferred implementation steps 
	public abstract void doSelect();
 	public abstract void doPayment();
 	public abstract void doDelivery();

 	// Implemented step
	public final void giftWrap() {
		try {
			System.out.println("Gift wrap successful");
		} catch (Exception e) {
			System.out.println("Gift wrap unsuccessful");
		}
	}


}
