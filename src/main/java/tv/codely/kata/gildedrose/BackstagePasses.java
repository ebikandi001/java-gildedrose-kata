package src.main.java.tv.codely.kata.gildedrose;

public class BackstagePasses extends UpdatableItem {

    private static final int MIN_SELLIN = 0;
    private static final int MEDIUM_SELLIN = 6;
    private static final int HIGH_SELLIN = 11;

    BackstagePasses(Item item){
        super(item);
    }

    @Override
    void update() {
        increaseQuality();
        if(sellIn() < HIGH_SELLIN) {
            increaseQuality();
        }
        if(sellIn() < MEDIUM_SELLIN) {
            increaseQuality();
        }
        decreaseSellIn();
        if(sellIn() < MIN_SELLIN) {
            resetQuality();
        }
    }
}
