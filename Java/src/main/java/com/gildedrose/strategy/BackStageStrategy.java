package com.gildedrose.strategy;

import com.gildedrose.ItemBehaviour;

public class BackStageStrategy {
    public void updateItem(ItemBehaviour item) {
        item.increaseQuality();

        if (item.getSellin() < 11) {
            item.increaseQuality();
        }

        if (item.getSellin() < 6) {
            item.increaseQuality();
        }
        item.decreaseSellin();

        if (item.getSellin() < 0) {
            item.qualityZero();
        }
    }
}
