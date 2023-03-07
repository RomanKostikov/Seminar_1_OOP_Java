package org.example.cw1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();

    public void intProduct(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return p;
            }


        }
        return new Product("product is  undefined", 0);

    }
}
