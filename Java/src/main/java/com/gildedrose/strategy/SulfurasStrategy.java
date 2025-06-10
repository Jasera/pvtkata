package com.gildedrose.strategy;

import com.gildedrose.ItemBehaviour;

public class SulfurasStrategy implements ItemStrategy {
    public void updateItem(ItemBehaviour itemBehaviour) {
        itemBehaviour.setFixedQuality(80);
    }
}
