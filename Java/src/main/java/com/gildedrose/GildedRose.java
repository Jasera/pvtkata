package com.gildedrose;

import com.gildedrose.strategy.AgedBrieStrategy;
import com.gildedrose.strategy.BackStageStrategy;
import com.gildedrose.strategy.DefaultStrategy;
import com.gildedrose.strategy.SulfurasStrategy;

class GildedRose {
    public static final String BACK_STAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    public static final String AGED_BRIE = "Aged Brie";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    AgedBrieStrategy agedBrieStrategy = new AgedBrieStrategy();
    BackStageStrategy backStageStrategy = new BackStageStrategy();
    SulfurasStrategy sulfurasStrategy = new SulfurasStrategy();
    DefaultStrategy defaultStrategy = new DefaultStrategy();

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemBehaviour itemBehaviour = new ItemBehaviour(item);

            if (item.name.equals(AGED_BRIE)) {
                agedBrieStrategy.updateItem(itemBehaviour);
            } else if (item.name.equals(BACK_STAGE_PASS)) {
                backStageStrategy.updateItem(itemBehaviour);
            } else if (item.name.equals(SULFURAS)) {
                sulfurasStrategy.updateItem(itemBehaviour);
            } else {
                defaultStrategy.updateItem(itemBehaviour);
            }
        }
    }
}
