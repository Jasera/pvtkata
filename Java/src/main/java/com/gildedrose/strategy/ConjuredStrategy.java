package com.gildedrose.strategy;

import com.gildedrose.ItemBehaviour;

public class ConjuredStrategy implements ItemStrategy {
    @Override
    public void updateItem(ItemBehaviour itemBehaviour) {
        itemBehaviour.decreaseQuality();
        itemBehaviour.decreaseQuality();

        itemBehaviour.decreaseSellin();

        if (itemBehaviour.getSellin() < 0) {
            itemBehaviour.decreaseQuality();
            itemBehaviour.decreaseQuality();
        }
    }
}
