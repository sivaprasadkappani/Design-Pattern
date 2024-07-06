package com.edlumens.msc.pattern.factorymethod.example1;

//Client code
public class Main {

	public static void main(String[] args) {
        ProductFactory factory = new ProductAFactory();
        factory.doSomething();

        factory = new ProductBFactory();
        factory.doSomething();
    }

}