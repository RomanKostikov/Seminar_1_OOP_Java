package org.example.cw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
 * содержащий в себе методы initProducts (List <Product>) сохраняющий в себе
 * список исходных продуктов и getProduct(String name)
 */
public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        List<Product> products = new ArrayList<>(Arrays.asList(new Product("pepsi", 42),
                new Product("chocolate", 67), new Product("cola", 70)));
        vendingMachine.intProduct(products);
        System.out.println(vendingMachine.getProduct("chocolate").toString());


    }
}
