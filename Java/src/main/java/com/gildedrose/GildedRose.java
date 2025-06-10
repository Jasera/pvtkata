package com.gildedrose;

class GildedRose {
    public static final String BACK_STAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    public static final String AGED_BRIE = "Aged Brie";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals(AGED_BRIE)) {
                increaseQuality(item);

                decreaseSellin(item);

                if (item.sellIn < 0) {
                    increaseQuality(item);
                }
            } else if (item.name.equals(BACK_STAGE_PASS)) {
                increaseQuality(item);

                if (item.sellIn < 11) {
                    increaseQuality(item);
                }

                if (item.sellIn < 6) {
                    increaseQuality(item);
                }

                decreaseSellin(item);

                if (item.sellIn < 0) {
                    qualityZero(item);
                }
            } else {

                if (!item.name.equals(SULFURAS)) {
                    decreaseQuality(item);
                }

                if (!item.name.equals(SULFURAS)) {
                    decreaseSellin(item);
                }

                if (item.sellIn < 0) {
                    if (!item.name.equals(SULFURAS)) {
                        decreaseQuality(item);
                    }
                }
            }
        }
    }

    private void qualityZero(Item item) {
        item.quality = 0;
    }

    private void decreaseSellin(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}
