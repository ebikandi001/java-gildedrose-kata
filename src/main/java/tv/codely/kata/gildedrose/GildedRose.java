package src.src.main.java.tv.codely.kata.gildedrose;

class GildedRose {
    Item[] items;

    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    private static final int MIN_QUALITY = 0;
    private static final int HIGH_QUALITY = 50;

    private static final int MIN_SELLIN = 0;
    private static final int MEDIUM_SELLIN = 6;
    private static final int HIGH_SELLIN = 11;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for(Item item : this.items) {
            switch(item.name) {
                case AGED_BRIE:
                    if (item.quality < HIGH_QUALITY) {
                        item.quality = item.quality + 1;
                    }
                    // lelengo if-else
                    item.sellIn = item.sellIn - 1;
                    if (item.sellIn < MIN_SELLIN) {
                        if (item.quality < HIGH_QUALITY) {
                            item.quality = item.quality + 1;
                        }
                    }
                    break;
                case BACKSTAGE_PASSES:
                    if (item.quality < HIGH_QUALITY) {

                        item.quality = item.quality + 1;
                        if (item.sellIn < HIGH_SELLIN) {
                            if (item.quality < HIGH_QUALITY) {
                                item.quality = item.quality + 1;
                            }
                        }

                        if (item.sellIn < MEDIUM_SELLIN) {
                            if (item.quality < HIGH_QUALITY) {
                                item.quality = item.quality + 1;
                            }
                        }
                    }
                    // lelengo if-else
                    item.sellIn = item.sellIn - 1;
                    if (item.sellIn < MIN_SELLIN) {
                        item.quality = item.quality - item.quality;
                    }
                    break;
                case SULFURAS:
                    break;
                default:
                    if (item.quality > MIN_QUALITY) {
                        item.quality = item.quality - 1;
                    }
                    // lelengo if-else
                    item.sellIn = item.sellIn - 1;
                    if (item.sellIn < MIN_SELLIN) {
                        if (item.quality > MIN_QUALITY) {
                                item.quality = item.quality - 1;

                        }
                    }
                    break;
            }
        }


       /* for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals(AGED_BRIE) && !items[i].name.equals(BACKSTAGE_PASSES)) {
                if (items[i].quality > MIN_QUALITY) {
                    if (!items[i].name.equals(SULFURAS)) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < HIGH_QUALITY) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals(BACKSTAGE_PASSES)) { //DONE
                        if (items[i].sellIn < HIGH_SELLIN) {
                            if (items[i].quality < HIGH_QUALITY) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < MEDIUM_SELLIN) {
                            if (items[i].quality < HIGH_QUALITY) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }
            if (!items[i].name.equals(SULFURAS)) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < MIN_SELLIN) {
                if (!items[i].name.equals(AGED_BRIE)) {
                    if (!items[i].name.equals(BACKSTAGE_PASSES)) {
                        if (items[i].quality > MIN_QUALITY) {
                            if (!items[i].name.equals(SULFURAS)) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < HIGH_QUALITY) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        } */
    }
}
