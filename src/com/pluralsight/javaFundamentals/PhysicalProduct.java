package com.pluralsight.javaFundamentals;

public class PhysicalProduct extends Product {

   private final int weight;

   public PhysicalProduct(String name, int price, int weight) {
      super(name, price);
      this.weight = weight;
   }

   @Override
   public int calculateShippingCost() {
      return Catalogue.SHIPPING_RATE * weight;
   }
}
