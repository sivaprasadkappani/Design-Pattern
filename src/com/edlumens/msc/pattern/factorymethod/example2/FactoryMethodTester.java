package com.edlumens.msc.pattern.factorymethod.example2;

public class FactoryMethodTester {
	public static void main(String[] args) {
		DisplayService service = new FeedbackXMLDisplayService();
		service.display();
		service = new ErrorXMLDisplayService();
		service.display();
		service = new OrderXMLDisplayService();
		service.display();
		service = new ResponseXMLDisplayService();
		service.display();
	}
}

/* Based of which factory instance is used for creating the product
 * a product in the class hierarchy is created.
 *
*/