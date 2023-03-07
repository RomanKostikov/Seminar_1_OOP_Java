package org.example.hw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс автомата горячих напитков
 */
public class VendingMachineHotDrinks implements VendingMachine {
    List<HotDrinks> hotDrinksList = new ArrayList<>();
    List<HotDrinks> resultFind = new ArrayList<>();

    /**
     * Переопределенный метод интерфейса VendingMachine
     */
    @Override
    public void initProduct() {
    }

    /**
     * Перегруженный метод
     *
     * @param list лист объектов класса hotDrinks
     */
    public void initProduct(List<HotDrinks> list) {
        this.hotDrinksList = list;
    }

    /**
     * Переопределенный метод
     *
     * @return null
     */
    @Override
    public String getProduct() {
        return null;
    }

    /**
     * Перегруженный метод получения горячего напитка по названию
     *
     * @return Список найденных экземпляров класса HotDrinks
     */
    public String getProduct(String name) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getName().equals(name)) resultFind.add(el);
        }
        return resultFind.toString();
    }

    /**
     * Перегруженный метод получения горячего напитка по цене (меньшей или равной)
     *
     * @return Список найденных экземпляров класса HotDrinks
     */
    public String getProduct(BigDecimal price) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getPrice().compareTo(price) <= 0) resultFind.add(el);
        }
        return resultFind.toString();
    }

    /**
     * Перегруженный метод получения горячего напитка по цене (меньшей или равной)
     *
     * @return Список найденных экземпляров класса HotDrinks
     */
    public String getProduct(int temp) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getTemp() <= temp) resultFind.add(el);
        }
        return resultFind.toString();
    }
}
