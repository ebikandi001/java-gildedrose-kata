package src.src.main.java.tv.codely.kata.gildedrose;

public class AgedBrie extends UpdatableItem {

    private static final int MIN_SELLIN = 0;

    AgedBrie(Item item) {
        super(item);
    }

    @Override
    void update() {
        increaseQuality();
        decreaseSellIn();
        if(sellIn() > MIN_SELLIN ) {
            increaseQuality();
        }
    }
}
