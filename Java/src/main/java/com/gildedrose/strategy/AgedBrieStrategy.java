package com.gildedrose.strategy;

import com.gildedrose.ItemBehaviour;

public class AgedBrieStrategy  {
    public void updateItem(ItemBehaviour itemBehaviour) {
        itemBehaviour.increaseQuality();;

        itemBehaviour.decreaseSellin();

        if (itemBehaviour.getSellin() < 0) {
            itemBehaviour.increaseQuality();;
        }
    }


}
