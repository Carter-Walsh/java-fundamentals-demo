package com.pluralsight.javaFundamentals;

import java.util.Map;

public class Catalogue {

    public final static int SHIPPING_RATE = 5;

    private static final Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new PhysicalProduct("Electric Toothbrush", 5000, 400),
            "Baby Alarm", new PhysicalProduct("Baby Alarm", 5000, 500),
            "War and Peace (e-book)", new DigitalProduct("War and Peace (e-book)", 1000)
    );

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
