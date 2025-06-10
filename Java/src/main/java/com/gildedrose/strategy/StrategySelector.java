package com.gildedrose.strategy;

public class StrategySelector {
    public static final String BACK_STAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    public static final String AGED_BRIE = "Aged Brie";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    private final AgedBrieStrategy agedBrieStrategy = new AgedBrieStrategy();
    private final BackStageStrategy backStageStrategy = new BackStageStrategy();
    private final SulfurasStrategy sulfurasStrategy = new SulfurasStrategy();
    private final DefaultStrategy defaultStrategy = new DefaultStrategy();

    public ItemStrategy selectStrategy(String name) {
        switch (name) {
            case SULFURAS:
                return sulfurasStrategy;
            case AGED_BRIE:
                return agedBrieStrategy;
            case BACK_STAGE_PASS:
                return backStageStrategy;
            default:
                return defaultStrategy;
        }
    }
}
