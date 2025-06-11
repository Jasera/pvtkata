package com.gildedrose.strategy;

import com.gildedrose.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StrategySelectorTest {
    StrategySelector strategySelector = new StrategySelector();


    @Test
    void getSulfurasStrategy() {
        ItemStrategy itemUpdateStrategy = strategySelector.selectStrategy(StrategySelector.SULFURAS);

        assertTrue(itemUpdateStrategy instanceof SulfurasStrategy);
    }

    @Test
    void getAgedBrieStrategy() {
        ItemStrategy itemUpdateStrategy = strategySelector.selectStrategy(StrategySelector.AGED_BRIE);

        assertTrue(itemUpdateStrategy instanceof AgedBrieStrategy);
    }

    @Test
    void getBackstagePassesStrategy() {
        ItemStrategy itemUpdateStrategy = strategySelector.selectStrategy(StrategySelector.BACK_STAGE_PASS);

        assertTrue(itemUpdateStrategy instanceof BackStageStrategy);
    }

    @Test
    void getDefaultStrategy() {
        ItemStrategy itemUpdateStrategy = strategySelector.selectStrategy("RANDOM NAME");

        assertTrue(itemUpdateStrategy instanceof DefaultStrategy);
    }

    @Test
    void getConjuredStrategy() {
        ItemStrategy itemUpdateStrategy = strategySelector.selectStrategy(StrategySelector.CONJURED);

        assertTrue(itemUpdateStrategy instanceof ConjuredStrategy);
    }
}
