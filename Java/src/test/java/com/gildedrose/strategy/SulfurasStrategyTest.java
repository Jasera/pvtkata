package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.ItemBehaviour;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SulfurasStrategyTest {

    @Test
    public void testSulfurasStrategy() {
        SulfurasStrategy strategy = new SulfurasStrategy();

        ItemBehaviour itemWrapper = new ItemBehaviour(new Item("Back Stage", 3, 20));

        strategy.updateItem(itemWrapper);

        assertEquals(3, itemWrapper.getSellin());
        assertEquals(80, itemWrapper.getQuality());
    }

}
