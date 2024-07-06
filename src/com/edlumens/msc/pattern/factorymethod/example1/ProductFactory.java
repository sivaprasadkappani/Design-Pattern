package com.edlumens.msc.pattern.factorymethod.example1;

//Abstract Factory class
abstract class ProductFactory {
 

 void doSomething() {
     Product product = createProduct();
     product.someMethodInProduct();
     // Perform additional operations with the product
 }
 
 // This is the Factory method
 abstract Product createProduct();
}