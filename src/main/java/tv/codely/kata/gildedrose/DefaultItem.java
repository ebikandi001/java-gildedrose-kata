package src.main.java.tv.codely.kata.gildedrose;

public class DefaultItem  extends UpdatableItem{

    private static final int MIN_QUALITY = 0;

    DefaultItem(Item item){
        super(item);
    }


    @Override
    void update() {
        decreaseSellIn();
        decreaseQuality();
        if(sellIn() < MIN_QUALITY){
            decreaseSellIn();
        }
    }
}
