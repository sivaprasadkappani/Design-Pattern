package com.edlumens.msc.pattern.factorymethod.example1;

//Concrete Factory for ProductB
class ProductBFactory extends ProductFactory {
 @Override
 Product createProduct() {
     return new ProductB();
 }
}