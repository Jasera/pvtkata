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
            if (!item.name.equals(AGED_BRIE)
                    && !item.name.equals(BACK_STAGE_PASS)) {
                if (item.quality > 0) {
                    if (!item.name.equals(SULFURAS)) {
                        decreaseQuality(item);
                    }
                }
            } else {
                if (item.quality < 50) {
                    increaseQuality(item);

                    if (item.name.equals(BACK_STAGE_PASS)) {
                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                increaseQuality(item);
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                increaseQuality(item);
                            }
                        }
                    }
                }
            }

            if (!item.name.equals(SULFURAS)) {
                decreaseSellin(item);
            }

            if (item.sellIn < 0) {
                if (!item.name.equals(AGED_BRIE)) {
                    if (!item.name.equals(BACK_STAGE_PASS)) {
                        if (item.quality > 0) {
                            if (!item.name.equals(SULFURAS)) {
                                decreaseQuality(item);
                            }
                        }
                    } else {
                        qualityZero(item);
                    }
                } else {
                    if (item.quality < 50) {
                        increaseQuality(item);
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
        item.quality = item.quality + 1;
    }

    private void decreaseQuality(Item item) {
        item.quality = item.quality - 1;
    }
}
