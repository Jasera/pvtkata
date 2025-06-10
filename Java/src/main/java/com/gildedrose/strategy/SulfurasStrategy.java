package com.gildedrose.strategy;

import com.gildedrose.ItemBehaviour;

public class SulfurasStrategy {
    public void updateItem(ItemBehaviour itemBehaviour) {
        itemBehaviour.setFixedQuality(80);
    }
}
