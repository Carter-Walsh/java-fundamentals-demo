package com.pluralsight.javaFundamentals;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // getProduct is static, meaning we don't have to create an instance for Catalogue before we can use it
        Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
        cart.addProduct(toothbrush);
        System.out.println(cart);
    }
}
