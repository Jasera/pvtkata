package com.gildedrose;

public class ItemBehaviour {
    private Item item;

    public ItemBehaviour(Item item) {
        this.item = item;
    }

    public void increaseQuality() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    public void decreaseQuality() {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    public void setFixedQuality(int fixedAmount) {
        item.quality = fixedAmount;
    }

    public void decreaseSellin() {
        item.sellIn = item.sellIn - 1;
    }

    public int getSellin() {
        return item.sellIn;
    }

    public int getQuality() {
        return item.quality;
    }
}
