package com.edlumens.msc.pattern.factorymethod.example1;

//Concrete ProductA
class ProductA implements Product {
 
 @Override
 public void someMethodInProduct() {
     System.out.println("ProductA created.");
 }
}