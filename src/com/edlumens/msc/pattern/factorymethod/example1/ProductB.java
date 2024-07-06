package com.edlumens.msc.pattern.factorymethod.example1;

//Concrete ProductB
class ProductB implements Product {
 @Override
 public void someMethodInProduct() {
     System.out.println("ProductB created.");
 }
}