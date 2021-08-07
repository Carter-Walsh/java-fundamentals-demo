package com.pluralsight.javaFundamentals;

public class BusinessCustomer extends Customer {

    public enum BusinessSize {SMALL, MEDIUM, LARGE}

    private final BusinessSize size;

    public BusinessCustomer(String name, long ccNumber, BusinessSize size) {
        super(name, ccNumber);
        this.size = size;
    }

    @Override
    public int calculateDiscount() {
        return switch (size) {
            case SMALL -> 5;
            case MEDIUM -> 10;
            case LARGE -> 20;
        };
    }

    @Override
    public String toString() {
        return "BusinessCustomer {" +
                super.toString() +
                " size=" + size +
                '}';
    }
}
