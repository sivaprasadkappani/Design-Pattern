package com.edlumens.msc.pattern.strategy;

public class StrategyPatternUser {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 40);

		cart.addItem(item1);
		cart.addItem(item2);

		PaymentStrategy strategy = null;
		
		// pay by paypal
		strategy = new PaypalStrategy("myemail@example.com", "mypwd");
		cart.pay( strategy );

		// pay by credit card
		strategy = new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15");
		cart.pay( strategy );
	}
}
