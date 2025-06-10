
package com.gildedrose.strategy;

import com.gildedrose.ItemBehaviour;

public class DefaultStrategy implements ItemStrategy {
    public void updateItem(ItemBehaviour itemBehaviour) {
        itemBehaviour.decreaseQuality();

        itemBehaviour.decreaseSellin();

        if (itemBehaviour.getSellin() < 0) {
            itemBehaviour.decreaseQuality();
        }
    }
}
