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
            ItemBehaviour itemBehaviour = new ItemBehaviour(item);

            if (item.name.equals(AGED_BRIE)) {
                itemBehaviour.increaseQuality();;

                itemBehaviour.decreaseSellin();

                if (itemBehaviour.getSellin() < 0) {
                    itemBehaviour.increaseQuality();;
                }
            } else if (item.name.equals(BACK_STAGE_PASS)) {
                itemBehaviour.increaseQuality();;

                if (itemBehaviour.getSellin() < 11) {
                    itemBehaviour.increaseQuality();;
                }

                if (itemBehaviour.getSellin() < 6) {
                    itemBehaviour.increaseQuality();;
                }

                itemBehaviour.decreaseSellin();

                if (itemBehaviour.getSellin() < 0) {
                    itemBehaviour.qualityZero();
                }
            } else if (item.name.equals(SULFURAS)) {
                item.quality = 80;
            } else {
                itemBehaviour.decreaseQuality();

                itemBehaviour.decreaseSellin();

                if (itemBehaviour.getSellin() < 0) {
                    itemBehaviour.decreaseQuality();
                }
            }
        }
    }
}
