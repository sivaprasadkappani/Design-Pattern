package com.edlumens.msc.pattern.factorymethod.example1;

//Concrete Factory for ProductA
class ProductAFactory extends ProductFactory {
 @Override
 Product createProduct() {
     return new ProductA();
 }
}