package com.edlumens.msc.pattern.templatemethod;

public class TemplateMethodUser {
	public static void main(String[] args)
    {
        OrderProcessTemplate netOrder = new OnlineOrder();
        netOrder.processOrder(true);
        System.out.println();
        
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }
}
