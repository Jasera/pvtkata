package com.gildedrose.strategy;

import com.gildedrose.ItemBehaviour;

public class BackStageStrategy {
    public void updateItem(ItemBehaviour itemBehaviour) {
        itemBehaviour.increaseQuality();

        if (itemBehaviour.getSellin() < 11) {
            itemBehaviour.increaseQuality();
        }

        if (itemBehaviour.getSellin() < 6) {
            itemBehaviour.increaseQuality();
        }
        itemBehaviour.decreaseSellin();

        if (itemBehaviour.getSellin() < 0) {
            itemBehaviour.setFixedQuality(0);
        }
    }
}
