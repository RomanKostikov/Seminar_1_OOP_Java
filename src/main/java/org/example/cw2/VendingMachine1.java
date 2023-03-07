package org.example.cw2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine1 extends VendingMachine {
    List<BottleOfWater> bottleOfWaters = new ArrayList<>();

    void initProduct(List<BottleOfWater> bottle) {
        this.bottleOfWaters = bottle;
    }

    @Override
    String getProduct(String name) {
        for (BottleOfWater p : bottleOfWaters) {
            if (p.getName().contains(name)) return p.getName() + " " + p.getPrice();
        }
        return new BottleOfWater("Не найдено!", 0).toString();
    }

}
