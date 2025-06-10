package com.gildedrose;

import com.gildedrose.strategy.ItemStrategy;
import com.gildedrose.strategy.StrategySelector;

class GildedRose {
    StrategySelector strategySelector = new StrategySelector();

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemStrategy itemStrategy = strategySelector.selectStrategy(item.name);

            itemStrategy.updateItem(new ItemBehaviour(item));
        }
    }
}
