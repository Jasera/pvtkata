package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemBehaviourTest {

    @Test
    void increaseQuality() {
        ItemBehaviour itemWrapper = new ItemBehaviour(new Item("test", 0 , 49));
        itemWrapper.increaseQuality();

        assertEquals(50, itemWrapper.getQuality());
    }

    @Test
    void increaseQuality50AndAbove() {
        ItemBehaviour itemWrapper = new ItemBehaviour(new Item("test", 0 , 50));
        itemWrapper.increaseQuality();

        assertEquals(50, itemWrapper.getQuality());
    }

    @Test
    void decreaseSellin() {
        ItemBehaviour itemWrapper = new ItemBehaviour(new Item("test", 1 , 50));
        itemWrapper.decreaseSellin();

        assertEquals(0, itemWrapper.getSellin());
    }
}
