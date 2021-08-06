package com.pluralsight.javaFundamentals;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {

    private static Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new Product("Electric Toothbrush", 3550),
            "Baby Alarm", new Product("Baby Alarm", 4999)
    );

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
