package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.ItemBehaviour;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefaultStrategyTest {

    @Test
    public void testDefaultStrategyPositiveSellin() {
        DefaultStrategy defaultStrategy = new DefaultStrategy();

        ItemBehaviour itemWrapper = new ItemBehaviour(new Item("Default", 1, 20));

        defaultStrategy.updateItem(itemWrapper);

        assertEquals(0, itemWrapper.getSellin());
        assertEquals(19, itemWrapper.getQuality());
    }

    @Test
    public void testDefaultStrategyZeroSellin() {
        DefaultStrategy defaultStrategy = new DefaultStrategy();

        ItemBehaviour itemWrapper = new ItemBehaviour(new Item("Default", 0, 20));

        defaultStrategy.updateItem(itemWrapper);

        assertEquals(-1, itemWrapper.getSellin());
        assertEquals(18, itemWrapper.getQuality());
    }

    @Test
    public void testDefaultStrategyNegativeSellin() {
        DefaultStrategy defaultStrategy = new DefaultStrategy();

        ItemBehaviour itemWrapper = new ItemBehaviour(new Item("Default", -1, 20));

        defaultStrategy.updateItem(itemWrapper);

        assertEquals(-2, itemWrapper.getSellin());
        assertEquals(18, itemWrapper.getQuality());
    }
}
