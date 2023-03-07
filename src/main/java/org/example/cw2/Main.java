package org.example.cw2;

import org.example.cw1.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды),
 * сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата
 * (пример: ПродающийБутылкиВодыАвтомат
 */
public class Main {
    public static void main(String[] args) {
        VendingMachine1 vm = new VendingMachine1();
        List<BottleOfWater> bw = new ArrayList<>(Arrays.asList(new BottleOfWater("pepsi", 42),
                new BottleOfWater("sprite", 67), new BottleOfWater("cola", 70)));
        vm.initProduct(bw);
        System.out.println(vm.getProduct("sprite").toString());
    }
}
